package Exercise1;

public class RecipeWithMicrowave extends AbstractRecipe {
    void getReady() {
        System.out.println("Switch on the microwave");
    }

    void doTheDish() {
        System.out.println("Put it in the microwave");
    }

    void cleanUp() {
        System.out.println("Switch off the microwave");
    }
}
