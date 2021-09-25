package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner  s  = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal cat1 = new Animal("Peach");
        Animal cat2 = new Animal("Jasper");
        Animal cat3 = new Animal("Poppy");
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.sort(Animal::byMid);
        Animal.printCats(animals);
        while (true) {
            System.out.println("что делать");
            System.out.println("1: покормить, 2: поиграть, 3: сводить к ветеринару, 4: завести ещё питомца, 5:следующий день");
            Integer i = s.nextInt();
            if (i == 4) {
                animals.add(Animal.makeCat());
                animals.sort(Animal::byMid);
            } else if (i == 3) {
                Animal.printCats(animals);
                System.out.println("С каким котом ");
                Integer p = s.nextInt();
                if (i == 1) {
                    if (animals.get(1).age <= 5) {
                        animals.get(1).changeHealthForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(1).name));
                    } else if (animals.get(1).age <= 10 && animals.get(1).age >= 6) {
                        animals.get(1).changeHealthForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(1).name));
                    } else if (animals.get(1).age >= 11) {
                        animals.get(1).changeHealthForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(1).name));
                    }
                } else if (i == 2) {
                    if (animals.get(2).age <= 5) {
                        animals.get(2).changeHealthForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(2).name));
                    } else if (animals.get(2).age <= 10 && animals.get(2).age >= 6) {
                        animals.get(2).changeHealthForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(2).name));
                    } else if (animals.get(2).age >= 11) {
                        animals.get(2).changeHealthForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(2).name));
                    }
                } else if (i == 3) {
                    if (animals.get(3).age <= 5) {
                        animals.get(3).changeHealthForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(3).name));
                    } else if (animals.get(3).age <= 10 && animals.get(3).age >= 6) {
                        animals.get(3).changeHealthForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(3).name));
                    } else if (animals.get(3).age >= 11) {
                        animals.get(3).changeHealthForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы сводили к врачу %s", animals.get(3).name));
                    }
                }

            }else if (i == 2){
                Animal.printCats(animals);
                System.out.println("С каким котом ");
                Integer p = s.nextInt();
                if (i == 1) {
                    if (animals.get(1).age <= 5) {
                        animals.get(1).changeMoralForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(1).name));
                    } else if (animals.get(1).age <= 10 && animals.get(1).age >= 6) {
                        animals.get(1).changeMoralForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(1).name));
                    } else if (animals.get(1).age >= 11) {
                        animals.get(1).changeMoralForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(1).name));
                    }
                } else if (i == 2) {
                    if (animals.get(2).age <= 5) {
                        animals.get(2).changeMoralForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(2).name));
                    } else if (animals.get(2).age <= 10 && animals.get(2).age >= 6) {
                        animals.get(2).changeMoralForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(2).name));
                    } else if (animals.get(2).age >= 11) {
                        animals.get(2).changeMoralForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(2).name));
                    }
                } else if (i == 3) {
                    if (animals.get(3).age <= 5) {
                        animals.get(3).changeMoralForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(3).name));
                    } else if (animals.get(3).age <= 10 && animals.get(3).age >= 6) {
                        animals.get(3).changeMoralForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(3).name));
                    } else if (animals.get(3).age >= 11) {
                        animals.get(3).changeMoralForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы поиграли с %s", animals.get(3).name));
                    }
                }

            }else if(i == 1){
                Animal.printCats(animals);
                System.out.println("С каким котом ");
                Integer p = s.nextInt();
                if (i == 1) {
                    if (animals.get(1).age <= 5) {
                        animals.get(1).changeSitostForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(1).name));
                    } else if (animals.get(1).age <= 10 && animals.get(1).age >= 6) {
                        animals.get(1).changeSitostForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(1).name));
                    } else if (animals.get(1).age >= 11) {
                        animals.get(1).changeSitostForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(1).name));
                    }
                } else if (i == 2) {
                    if (animals.get(2).age <= 5) {
                        animals.get(2).changeSitostForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(2).name));
                    } else if (animals.get(2).age <= 10 && animals.get(2).age >= 6) {
                        animals.get(2).changeSitostForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(2).name));
                    } else if (animals.get(2).age >= 11) {
                        animals.get(2).changeSitostForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(2).name));
                    }
                } else if (i == 3) {
                    if (animals.get(3).age <= 5) {
                        animals.get(3).changeSitostForFive();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(3).name));
                    } else if (animals.get(3).age <= 10 && animals.get(3).age >= 6) {
                        animals.get(3).changeSitostForTeen();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(3).name));
                    } else if (animals.get(3).age >= 11) {
                        animals.get(3).changeSitostForOld();
                        animals.sort(Animal::byMid);
                        System.out.println(String.format("Вы покормили %s", animals.get(3).name));
                    }
                }

            }else if(i == 5){
                animals.forEach(Animal::nextDayChange);
                Animal.printCats(animals);
            }


        }
    }
}
