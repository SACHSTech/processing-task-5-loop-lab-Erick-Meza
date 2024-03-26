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
  }

  // Creates a method for the third quadrant of the image
  public void draw_section3() {
  }

  // Creates a method for the third quadrant of the image
  public void draw_section4() {
  }

  // Creates a method for the fifth quadrant of the image
  public void draw_section5() {
  }

  // Creates a method for the sixth quadrant of the image
  public void draw_section6() {
  }

  // Creates a method for the seventh quadrant of the image
  public void draw_section7() {
    }

  // Creates a method for the eighth quadrant of the image
  public void draw_section8() {
    }
  }