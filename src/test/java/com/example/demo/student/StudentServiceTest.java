package com.example.demo.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class StudentServiceTest {
    @Mock private StudentRepository studentRepository;
    private AutoCloseable autoCloseable;
    private StudentService underTest;


    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new StudentService(studentRepository);
    }

    @Test
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void cangetAllStudents() {
        // when
        underTest.getAllStudents();
        // then
        verify(studentRepository).findAll();
    }

    @Test
    @Disabled
    void addStudent() {
    }

    @Test
    @Disabled
    void deleteStudent() {
    }
}