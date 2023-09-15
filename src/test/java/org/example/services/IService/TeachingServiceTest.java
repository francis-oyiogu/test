package org.example.services.IService;

import org.example.oop.domain.Teacher;
import org.example.oop.enums.TEACHER_TYPE;
import org.example.oop.services.IService.TeachingService;
import org.example.oop.services.TeachingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeachingServiceTest {

    Teacher teacher;
    TeachingService ts;

    @BeforeEach
    void setUp() {
        teacher = new Teacher("Francis"); //given
        ts = new TeachingServiceImpl();
    }

    @Test
    @Disabled("This method is for teaching")
    void shouldTeach() {
        //given
        teacher = new Teacher("Francis", TEACHER_TYPE.SENIOR); //given
        //when
        Teacher actual = ts.teach(teacher);

        //then
        Teacher expected = new Teacher("Francis", TEACHER_TYPE.SENIOR);

        assertEquals(expected,actual);
    }

    @Test
    @Disabled("This method is for teaching fail")
    void shouldNotTeach() {
        //when
        Teacher actual = ts.teach(teacher);

        //then
        Teacher expected = new Teacher("Francis", TEACHER_TYPE.SENIOR);

        assertNotEquals(expected,actual);
    }
}