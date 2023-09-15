package org.example.oop.domain;

import org.example.oop.enums.TEACHER_TYPE;

import java.util.Objects;

public class Teacher{
    private final String name;
    private final TEACHER_TYPE teacherType;

    public Teacher(String name, TEACHER_TYPE teacherType) {
        this.name = name;
        this.teacherType = teacherType;
    }

    public Teacher(String name) {
        this.name = name;
        this.teacherType = TEACHER_TYPE.JUNIOR;
    }

    public String getName() {
        return name;
    }

    public TEACHER_TYPE getTeacherType() {
        return teacherType;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teacherType=" + teacherType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(getName(), teacher.getName()) && getTeacherType() == teacher.getTeacherType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTeacherType());
    }
}
