
# Graphical-Micro-Architecture-Simulator

## What has been added to this forked version

* **Integrated all the instructions of the LEGv8 ISA**, including the floating point operations.
* Fixed all the major bugs that impeded the correct execution of code. Corrected stack base to be quadword aligned.
* Integrated the project with Maven in order to make importing, configuration and development effortless.
* Added a visualization for the stack and for the floating point registers. Reorganized the UI to best fit the new additions.
* The project and the AceGWT library have been updated to use GWT 2.11.0

## How to develop and package the project
You can import this Maven project with your favorite Java IDE that supports git cloning and Maven projects (or you can do everything manually with the individual command line utilities). To just compile the sources you run the gwt:compile Maven action inside the LEGv8_Simulator folder.
To package the application with the web resources (images, .css files, .html files, etc.) you need to run the "package" action inside the aforementioned folder. This will do both the compilation and the correct moving of the web resources, so it's the recommended action to execute in general.
If you use an IDE these steps might be made easier by the means of UI elements. Use the command line only if you already know how Maven works.
GWT only implements a subset of the Java 8 JRE, this means you need to limit your syntax to this version.
### IntelliJ IDEA
IntelliJ Ultimate offers a GWT plugin that warns the programmer when using methods, syntax and classes not implemented by GWT and can generate compile reports.
Be warned that in some cases it might show bogous errors (for example it doesn't recognize the .css resource so it gives errors when mentioning its directives in the code) but this shouldn't affect the compilation which is done with GWT.
This is the suggested working environment because its modern features and integrations.
### Eclipse
Eclipse offers a GWT plugin (which has installation problems with Eclipse version newer than the 2023-09) that makes compilation easy but unlike the maven "package" action deploys the compiled sources into a "war" folder and doesn't automatically copy-paste the web resources needed to launch the web page. That has to be done manually.
It is suggested to use the Maven actions with Eclipse, especially because this allows you to install the latest version of the IDE.
### Command Line
You can download, develop, build and package this project using git and maven from the command line together with your favorite IDE or text editor.
To do this you simply git clone the repository, set it up using maven, make your changes and generate a working package as written above.

This effort has been made in the context of the **_Digital Systems Architectures_** course held at the **_Department of Engineering and Architecture_** at the **_[University of Trieste](https://www.units.it/en)_** under the guidance of _**Prof. Alberto Carini**_ . 

The Graphical Micro-Architecture Simulator is a web browser-based simulator for a subset of the Arm instructions. Specifically, this tool provides the expected execution results for the LEGv8 instructions, which is a subset of Arm®v8-A instructions based on the [Computer Organization and Design (Arm Edition)](https://www.elsevier.com/books/computer-organization-and-design-arm-edition/patterson/978-0-12-801733-3) textbook by David A. Patterson & John L. Hennessy. This simulator can be run locally on a PC, and is offered exclusively and at no cost to academics, teaching staff, and learners worldwide. 

**Note: This tool is currently a BETA version.**

 
 ## Kit features

* Cross-platform, no installation required.
* Contains a code editor, with a visible and interactive register file.
* Shows visual datapaths similar to those in the [Computer Organization and Design (Arm Edition)](https://www.elsevier.com/books/computer-organization-and-design-arm-edition/patterson/978-0-12-801733-3) textbook by David A. Patterson & John L. Hennessy. 
* Execution mode:
    * Has ability to step through execution of instructions.
    * Provides expected results (register contents, flags).
    * Contains single-cycle CPU and pipelined CPU view.
    * Highlights datapaths of the CPU that uses a specific instruction. 
* Documentation provided.
* **Prerequisites:** Basics of assembly programming.


## Purpose of the Simulator
To produce learners who can program using Arm instructions and describe the corresponding datapaths involved in a single-cycle or a pipelined CPU. The simulator also provides error messages/feedback for learning purposes. 

A fundamental understanding of an Instruction Set Architecture (ISA) is a crucial skill for all aspiring hardware designers and developers. The ISA acts as the interface between hardware and software, specifying what the instruction set can do and how the processor makes use of those instructions - helping developers write more efficient code.

Sometimes, however, students struggle to understand how the ISA executes complex commands, for instance for the CPU, databus, memory and I/O. This simulator simplifies this interaction by allowing students to visualize the instruction execution, establishing a clear link between the inner architecture of a microprocessor and the instructions required to efficiently execute commands on the hardware.

**This tool is currently a BETA version. If there are any issues, please read the Reporting Bugs section in [here.](https://github.com/arm-university/Graphical-Micro-Architecture-Simulator/blob/main/Contributions_and_Modifications/Contributions_And_Modifications.md)**

## How to Use
Either clone this repository or [download the simulator here.](https://github.com/arm-university/Graphical-Micro-Architecture-Simulator/archive/refs/heads/main.zip)


1.	Navigate to `LEGv8_Simulator/target` directory and open `LEGv8_Simulator-1.0-SNAPSHOT/LEGv8_Simulator.html` using a web browser. 
2.	Click the **Help** tab on the top right of the simulator, which contains further documentation on usage. 

## Modifications and Contributions
We welcome any bug fixes, modifications, and contributions to this tool. For more information, please click [here.](https://github.com/arm-university/Graphical-Micro-Architecture-Simulator/tree/main/Contributions_and_Modifications)

## License
You are free to fork or clone this material. See [LICENSE.md](https://github.com/arm-university/Graphical-Micro-Architecture-Simulator/blob/main/License/LICENSE.md) for the complete license.

## Inclusive Language Commitment
Arm is committed to making the language we use inclusive, meaningful, and respectful. Our goal is to remove and replace non-inclusive language from our vocabulary to reflect our values and represent our global ecosystem.
 
Arm is working actively with our partners, standards bodies, and the wider ecosystem to adopt a consistent approach to the use of inclusive language and to eradicate and replace offensive terms. We recognise that this will take time. This tool may contain references to non-inclusive language; it will be updated with newer terms as those terms are agreed and ratified with the wider community. We recognise that some of you will be accustomed to using the previous terms and may not immediately recognise their replacements. We encourage the use of the following terminology where applicable:

* When introducing the architecture, we will use the term ‘Requester’ instead of ‘Master’ and ‘Completer’ instead of ‘Slave’. 

 
Contact us at education@arm.com with questions or comments about this tool. You can also report non-inclusive and offensive terminology usage in Arm content at terms@arm.com.
