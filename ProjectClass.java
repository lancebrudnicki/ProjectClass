


public class ProjectClass{
    private String name;
    private String description;

    public ProjectClass(){
        this("Project X", "It is not to be spoken of");
    }
    public ProjectClass(String name){
        this(name , "It is not to be spoken of");
    }
    public ProjectClass(String nameParam, String descriptionParam ){
        name = nameParam;
        description = descriptionParam;
    }


    public String ElevatorPitch(){
        return "This is the Project name " + name + ":" + description;
    }


    // getter for name
    public String getName(){
        return name;
    }
    //setter for name
    public void setName(String title){
        name = title;
    }
    // getter for the description
    public String getDescription(){
        return description;
    }
    // setter for the description
    public void setDescription(String newDescription){
        description = newDescription;
    }

}