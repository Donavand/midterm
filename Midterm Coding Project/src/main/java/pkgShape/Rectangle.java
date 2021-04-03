package pkgShape;

public class Rectangle extends shape{
        private int iWidth;
        private int iLength;
        
        public Rectangle(int width, int length) {
        	     super();
        	     iWidth = width;
        	     iLength = length;
        }
        public int getiWidth() {
        	    return iWidth;
        }
        public void setiwidth(int width) {
        	    iWidth = width;
        }
        public int getiLength() {
        	    return iLength;
        }
        public void setiLength(int length) {
        	     iLength = length;
        }
        public double area() {
        	     return iWidth * iLength;
        }
        public double perimeter() {
        	    return (2 * iWidth) + (2 * iLength);
        }
        public class SortByArea {
        	    SortByArea() {
        	    	
        	    }
                public int compare(Rectangle r1, Rectangle r2) {

                	    if (r1.area() > r2.area())   {
                	    	    return 1;
                	    } else if (r1.area() == r2.area()) {
                	    	    return 0;
                	    } else {    
                	    	    return -1;
                	    }
               }
          }
   }
        