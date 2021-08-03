public class ProjectClassTest{
    public static void main(String[] args){
        
        ProjectClass project1 = new ProjectClass("Plan Z", "We will attack the Germans first");
        ProjectClass project2 = new ProjectClass("Plan C", "We will attack the Canadians first");
        project2.setName("Plan 7");
        System.out.println(project2.ElevatorPitch());
    }
}