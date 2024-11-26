package com.arm.legv8simulator.client.memory;


/**
 * <code>ByteBuffer</code> is a byte buffer of client specified length, used to store data in
 * big-endian format. Data - <code>bytes</code>, <code>ints</code> and <code>longs</code> -
 * can be read and written from arbitrary locations within the buffer. No bounds checking is
 * performed so attempting to read or write from an index outside the buffer will result in
 * a <code>NullPointerException</code>.
 * <p>
 * This class has been written because java.nio.ByteBuffer and java.io.DataInputStream is not supported by GWT.
 *
 * @author Jonathan Wright, 2016
 */

class ByteBuffer {

    private final byte[] buffer;


    /**
     * @param capacity the number of bytes in this ByteBuffer
     */
    public ByteBuffer(final int capacity) {
        buffer = new byte[capacity];
    }

    /**
     * @param index the location to insert data in this ByteBuffer
     * @param value the byte to be inserted into the ByteBuffer
     */
    public void putByte(final int index, final byte value) {
        buffer[index] = value;
    }

    /**
     * @param index the location to retrieve data
     * @return the byte at <code>index</code> in this ByteBuffer
     */
    public byte getByte(final int index) {
        return buffer[index];
    }

    /**
     * Data is inserted in big-endian format
     *
     * @param index the location to insert data in this ByteBuffer
     * @param value the two bytes to be inserted into the ByteBuffer
     */
    public void putHalfWord(final int index, final int value) {
        for (int i = index; i < Memory.HALFWORD_SIZE; i++) {
            putByte(i, (byte) (value >>> (Memory.HALFWORD_SIZE - 1 - i) * Memory.BITS_IN_BYTE));
        }
    }

    /**
     * Data in the ByteBuffer is interpreted in big-endian format
     *
     * @param index the location to retrieve data
     * @return the <code>int</code> formed by concatenating the two bytes starting at <code>index</code> in this ByteBuffer
     */
    public int getHalfWord(final int index) {
        int result = 0;
        for (int i = index; i < Memory.HALFWORD_SIZE; i++) {
            result = result << Memory.BITS_IN_BYTE;
            result = result | (getByte(i) & 0x000000ff);
        }
        return result;
    }

    /**
     * Data is inserted in big-endian format
     *
     * @param index the location to insert data in this ByteBuffer
     * @param value the four bytes to be inserted into the ByteBuffer
     */
    public void putWord(final int index, final int value) {
        for (int i = index; i < Memory.WORD_SIZE; i++) {
            putByte(i, (byte) (value >>> (Memory.WORD_SIZE - 1 - i) * Memory.BITS_IN_BYTE));
        }
    }

    /**
     * Data in the ByteBuffer is interpreted in big-endian format
     *
     * @param index the location to retrieve data
     * @return the <code>int</code> formed by concatenating the four bytes starting at <code>index</code> in this ByteBuffer
     */
    public int getWord(final int index) {
        int result = 0;
        for (int i = index; i < Memory.WORD_SIZE; i++) {
            result = result << Memory.BITS_IN_BYTE;
            result = result | (getByte(i) & 0x000000ff);
        }
        return result;
    }

    /**
     * Data is inserted in big-endian format
     *
     * @param index the location to insert data in this ByteBuffer
     * @param value the eight bytes to be inserted into the ByteBuffer
     */
    public void putDoubleWord(final int index, final long value) {
        for (int i = index; i < Memory.DOUBLEWORD_SIZE; i++) {
            putByte(i, (byte) (value >>> (Memory.DOUBLEWORD_SIZE - 1 - i) * Memory.BITS_IN_BYTE));
        }
    }

    /**
     * Data in the ByteBuffer is interpreted in big-endian format
     *
     * @param index the location to retrieve data
     * @return the <code>long</code> formed by concatenating the eight bytes starting at <code>index</code> in this ByteBuffer
     */
    public long getDoubleWord(final int index) {
        long result = 0L;
        for (int i = index; i < Memory.DOUBLEWORD_SIZE; i++) {
            result = result << Memory.BITS_IN_BYTE;
            result = result | (getByte(i) & 0x00000000000000FFL);
        }
        return result;
    }

}
