package midtermexam;

public class ExamTest {
    
    public static void main(String[] args) {
        
        String name = "Derick";
        double height = 1.0;
        double weight = 60.5;
        
        for(double limit = 0.0;limit < 3.0;limit++){
            
            height++;
            weight++;
            
            getBMI(height,weight);
            
            double calculatedBMI = getBMI(height,weight);
            
            if(calculatedBMI >= 25.0){
                
                System.out.println("Overweight");
                
            }else if(calculatedBMI >= 18.5 && calculatedBMI <= 24.9){
                
                System.out.println("Healthy");
                
            }else if(calculatedBMI < 18.0){
                
                System.out.println("Underweight");
                
            }else{
                
                System.out.println("The results are inconclusive!");
                
            }
            
        }
        
    }
    
    public static double getBMI(double height,double weight){
        
        double BMI = weight / height;
        System.out.println("The calculated Body Mass Index is " + BMI + ".");
        
        return BMI;
        
    }
    
}
