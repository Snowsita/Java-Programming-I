
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recipes = new ArrayList<>();

        System.out.println("Enter file name:");
        String file = scanner.nextLine();

        while (true) {
            if (file.isEmpty()) {
                break;
            }

            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");

            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("list")) {

                System.out.println("Recipes:");

                try (Scanner scan = new Scanner(Paths.get(file))) {
                    while (scan.hasNextLine()) {
                        String row = scan.nextLine();
                        recipes.add(row);

                        if (row.isEmpty()) {
                            System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                            recipes.clear();
                        }

                    }

                    System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                    recipes.clear();

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (command.equals("find name")) {
                System.out.println("Enter word to find:");
                String word = scanner.nextLine();

                try (Scanner scan = new Scanner(Paths.get(file))) {
                    while (scan.hasNextLine()) {
                        String row = scan.nextLine();
                        recipes.add(row);

                        if (row.isEmpty()) {
                            if (recipes.get(0).toLowerCase().contains(word.toLowerCase())) {
                                System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                            }
                            recipes.clear();
                        }

                    }
                    if (recipes.get(0).toLowerCase().contains(word.toLowerCase())) {
                        System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                    }
                    recipes.clear();

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());

                try (Scanner scan = new Scanner(Paths.get(file))) {
                    while (scan.hasNextLine()) {
                        String row = scan.nextLine();
                        recipes.add(row);

                        if (row.isEmpty()) {
                            if (Integer.valueOf(recipes.get(1)) <= time) {
                                System.out.println("Recipes:");
                                System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                            }
                            recipes.clear();
                        }

                    }
                    if (Integer.valueOf(recipes.get(1)) <= time) {
                        System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                    }
                    recipes.clear();

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();

                try (Scanner scan = new Scanner(Paths.get(file))) {
                    while (scan.hasNextLine()) {
                        String row = scan.nextLine();
                        recipes.add(row);

                        if (row.isEmpty()) {
                            for (int i = 2; i < recipes.size(); i++) {
                                if (recipes.get(i).toLowerCase().equals(ingredient.toLowerCase())) {
                                    System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                                }
                            }
                            recipes.clear();
                        }
                        
                    }

                    for (int i = 2; i < recipes.size(); i++) {
                        if (recipes.get(i).toLowerCase().equals(ingredient.toLowerCase())) {
                            System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                        }
                    }

                    recipes.clear();

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            }
        }

    }

}
