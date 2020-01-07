public class Arrays {

  public static void main(String[] args){

    // instantiate and assign at the same time
    int[] nums = {5, 7, 3, 73, 44, 1};
    String[] cars = {"Tesla", "Mercedes", "Audi", "Lamborghini"};

    // using square brackets you can assign an element
    nums[2] = 999;
    cars[0] = "Ford";

    // and access
    System.out.println(nums[2]);
    System.out.println(cars[0]);

    // which means this is how you use a traditional for loop
    for(int i = 0; i < nums.length; i++){
      System.out.println(nums[i]);
    }

    // and using a for each loop
    for(String car : cars){
      System.out.println(car);
    }

  }

}
