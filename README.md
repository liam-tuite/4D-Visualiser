# 4D-Visualiser
A Java project that provides a display of 4-Dimensional graphics.
 
The general idea of this project is to provide a display of all 5 regular convex 3-polytopes as well as all 6 regular convex 4-polytopes.
The current implementation has all of the 3D shapes but only 4 of the 6 4D shapes, so the project isn't complete yet.

To run the program, you can download the program executable "4D Visualiser.jar" and run it (this requires JRE to be installed). Alternatively, you could download the source code, compile, and run the src/gui/MainWindow class.

This program was my final year project for my BSc in Computer Applications at Dublin City University, from which I graduated in 2017. I aimed to produce a rotating, interactive image of each of the 6 convex regular 4-polytopes with the program. Much of the mathematics involved in projecting vertices from 4-space to 3-space and then from 3-space to 2-space in order to generate an image on a computer I got from this research paper: https://hollasch.github.io/ray4/Four-Space_Visualization_of_4D_Objects.html

Here's a sample animation of an 8-cell (or tesseract):
![Tesseract](https://github.com/liam-tuite/4D-Visualiser/blob/master/tesseract.gif)
