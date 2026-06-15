package Activities;

public class Activity5 {

	 public static void main(String[] args) {

class MyBook {

    // Variable
    private String title;

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter
    public String getTitle() {
        return title;
    }
}

	        // Create object of MyBook class
	        MyBook newNovel = new MyBook();

	        // Set the title
	        String title = "Hover Car Racer";
	        newNovel.setTitle(title);

	        // Print the title using getTitle()
	        System.out.println(newNovel.getTitle());
	    }
	
}