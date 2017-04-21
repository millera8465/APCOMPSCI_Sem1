/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  //Exercise 3:
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
    //Exercise 4:
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
//Exercise 5:
	public static void testGrayscale() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}
//Exercise 6:
	public static void testFixUnderwater() {
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

//Exercise 1:
	public static void testMirrorVerticalRightToLeft() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}
	
//Exercise 2:
	public static void testMirrorHorizontal() {
		Picture motorcycle = new Picture("redMotorcycle.jpg");
		motorcycle.explore();
		motorcycle.mirrorHorizontal();
		motorcycle.explore();
	}
//Exercise 3:
	public static void testMirrorHorizontalBotToTop() {
		Picture motorcycle = new Picture("redMotorcycle.jpg");
		motorcycle.explore();
		motorcycle.mirrorHorizontalBotToTop();
		motorcycle.explore();
	}
//Exercise 4:
	public static void testMirrorDiagonal(int length) {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal(length);
		beach.explore();
	}

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

//Exercise 2:
	public static void testMirrorArms() {
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}
	
//Exercise 3:
	public static void testMirrorGull() {
		Picture seagull = new Picture("seagull.jpg");
		seagull.explore();
		seagull.mirrorGull();
		seagull.explore();
	}

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testCopy()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollageTwo();
		canvas.explore();
	}
	public static void testMyCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.myCollage();
		canvas.explore();
	}
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
    public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal(500);
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testCollage();
    //testCopy();
	//testMyCollage();
    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}