import java.time.LocalDateTime;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.partitioningBy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[]args){
        List<Human> input=new ArrayList<>();
        Human Egor=new Human(19,"Egor","Hripachev",85,LocalDate.of(2001,12,12));
        Human Valera=new Human(54,"Valeriy","Jmishenko",80, LocalDate.of(2000,12,12));
        Human Sergey=new Human(20,"Sergey","Volga",70, LocalDate.of(2001,2,2));
        Human Kolya=new Human(17,"Nikolay","Orlov",80, LocalDate.of(2000,12,12));
        Human John=new Human(53,"John","Wick",70, LocalDate.of(2001,2,2));
        input.add(Egor);
        input.add(Valera);
        input.add(Sergey);
        input.add(Kolya);
        input.add(John);
        System.out.println(Egor.birthDate);
        System.out.println("///////Sorting by age///////");
        input.stream()
                .sorted(Comparator.comparingInt(Human::getAge))
                .forEach(System.out::println);
        System.out.println("////////Filter by 20 years///////");
        input.stream()
                .filter(n -> n.getAge() < 20)
                .forEach(System.out::println);
        System.out.println("///////Contains 'e'////////");
        input.stream()
                .filter(k->k.getFirstName().contains("e"))
                .forEach(System.out::println);
        System.out.println("////////Concatenation///////");
        input.stream()
                .flatMap(c->Stream.of(c.getFirstName().charAt(0)))
                .forEach(System.out::print);
    }

}
