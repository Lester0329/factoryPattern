package factoryPattern;

import java.util.Scanner;
public class clinic {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            choice = s.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            if (choice == 1)
            {
                pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                petFile.setBreed("German Shepherd");
                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: " + petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                System.out.println("Breed: "+ petFile.getBreed());

            }
            else if (choice == 2)
            {
                pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                petFile.setNoOflives(9);
                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: " + petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                System.out.println("Number of lives: "+ petFile.getNoOflives());

            }
            else if(choice >= 4)
            {
                System.out.println("\nInvalid input!\n");
                break;
            }
        }
        while(choice !=3);
        System.out.println("EXITING");
    }
}

