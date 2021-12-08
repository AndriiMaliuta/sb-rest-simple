package com.anma.sb.sbrestsimple;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    static List<Cat> cats = List.of(new Cat("Murz", 5), new Cat("Murko", 7));


    @GetMapping("/")
    public String home() {
        return "TEST message";
    }

    @GetMapping("/cats")
    public List<Cat> cats() {
        return List.of(new Cat("Murz", 5), new Cat("Murko", 7));
    }
}


class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
