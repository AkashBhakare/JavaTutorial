class Movie {
  private String title;
  private float length;
  
  public String get_title(){
    return title;
  }
  public float get_length(){
    return length;
  }
  Movie(){
	  title = "Not yet decided";
	  length = 180;
  }
  Movie(String title, float length){
	  this.title  = title;
	  this.length = length;
  }
}

public class TestMovie{
	
  public static void main(String[] args){
    Movie mov1 = null; /*Creates a class type reference */
    
	mov1 = new Movie(); /*Creates object of Type Movie*/
    System.out.println(mov1);
    System.out.println("Title : "+ mov1.get_title());
    System.out.println("Length(min) : "+ mov1.get_length());
	
	Movie mov2 = new Movie("Last Emperor",70); /*Creates object of Type Movie*/
    System.out.println(mov2);
    System.out.println("Title : "+ mov2.get_title());
    System.out.println("Length(min) : "+ mov2.get_length());
  }
}
