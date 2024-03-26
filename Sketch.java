import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(1200, 600);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();

    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }

  // Creates a method for the first quadrant of the image
  public void draw_section1() {

    // Creates a Nested Loop inside a Loop to create a 30x30 grid of pixels
    for (int intPixelNumber = 0; intPixelNumber <= 30; intPixelNumber++) {
      for (float i = 2; i < width / 4; i += 10) {
        for (float j = 302; j < 600; j += 10) {
          noStroke();
          fill(255, 255, 255);
          rect(i, j, 5, 5);
        }
      }
    }
  }

  // Creates a method for the second quadrant of the image
  public void draw_section2() {

    // Creates a Nested loop to create pixel drawing
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {

        // Creates a Conditional Selective Algorithm to determine the colour of the
        // pixels
        if (j % 2 == 0) {
          fill(255, 255, 255);
        } else if (j % 2 != 0) {
          fill(0, 0, 0);
        }

        // Initializes variables
        int intXCoordinate = 304 + j * 5 * 2;
        int intYCoordinate = 304 + i * 5 * 2;

        // Prints out squares to the screen
        rect(intXCoordinate, intYCoordinate, 5, 5);
      }
    }
  }

  // Creates a method for the third quadrant of the image
  public void draw_section3() {

    // Creates a Nested loop to create pixel drawing
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {

        // Creates a Conditional Selective Algorithm to determine the colour of the
        // pixels
        if (i % 2 == 0) {
          fill(255, 255, 255);
        } else if (i % 2 != 0) {
          fill(0, 0, 0);
        }

        // Initializes coordinate variables
        int intXCoordinate = 604 + j * 5 * 2;
        int intYCoordinate = 304 + i * 5 * 2;

        // Prints out pixels in quadrant 3
        rect(intXCoordinate, intYCoordinate, 5, 5);
      }
    }
  }

  // Creates a method for the third quadrant of the image
  public void draw_section4() {

    // Creates a Nested loop to create pixel drawing
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {

        // Creates a Conditional Selective Algorithm to determine pixel colour
        if (i % 2 == 0) {
          fill(0, 0, 0);
        } else if (i % 2 != 0) {
          if (j % 2 == 0) {
            fill(255, 255, 255);
          } else if (j % 2 != 0) {
            fill(0, 0, 0);
          }
        }

        // Initializes cvariables for the coordinates
        int intXCoordinate = 904 + j * 5 * 2;
        int intYCoordinate = 304 + i * 5 * 2;

        // Outputs the pixels onto the screen
        rect(intXCoordinate, intYCoordinate, 5, 5);
      }
    }
  }

  // Creates a method for the fifth quadrant of the image
  public void draw_section5() {

    // Initializes variables
    int intPixelNumber = 10;

    // Creates a Nested loop to print the right amount of pixels
    for (int i = 594; i >= intPixelNumber; i -= 10) {
      for (int j = 292; j >= intPixelNumber; j -= 10) {

        // Prints out the pixels in quadrant 5
        fill(255, 255, 255);
        rect(j, i - 300, 5, 5);
      }

      // Reassigns the value of variables
      intPixelNumber += 10;
    }
  }

  // Creates a method for the sixth quadrant of the image
  public void draw_section6() {

    // Initializes variables
    int intPixelNumber = 600;

    // Creates a Nested Loop to output pixels
    for (int i = 900; i >= intPixelNumber; i -= 10) {
      for (int j = 302; j <= intPixelNumber; j += 10) {
        fill(255, 255, 255);
        rect(j, i - 606, 5, 5);
      }

      // Reassigns values of variables
      intPixelNumber -= 10;
    }
  }

  // Creates a method for the seventh quadrant of the image
  public void draw_section7() {
  }

  // Creates a method for the eighth quadrant of the image
  public void draw_section8() {
  }
}