package pkgShape;

public class Cuboid extends Rectangle{
	    private int iDepth;
	    
	    public Cuboid(int length, int width, int depth) {
	            super(width,length);
	            iDepth = depth;	            
	    }
        public int getiDepth() {
        	    return iDepth;
        }
        public void setiDept(int depth) {
        	    iDepth = depth;        	
        }
        public double volume() {
        	    return(super.getiLength() * super.getiWidth() * this.getiDepth());
        }
        public double area() {
        	    return(2*(super.getiLength() * super.getiWidth()) + (2*(super.getiLength()*this.iDepth) + (2*(iDepth *super.getiWidth()))));
        }
        public double perimeter() {
        	    throw new UnsupportedOperationException();
        }
        public class SortByVolume { 
        	    SortByVolume() {
                }
       public int compare(Cuboid c1, Cuboid c2) {
    	      
    	      if (c1.volume() > c2.area())  {
    	    	      return 1;
    	      } else if (c1.volume()==c2.volume()) {
    	    	      return 0;
    	      }else { 
    	    	     return -1;
    	      }
    	    }
       }
   }