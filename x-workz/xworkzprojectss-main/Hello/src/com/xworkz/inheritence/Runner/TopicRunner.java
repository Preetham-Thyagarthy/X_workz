package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.topic.Mathematics;
import com.xworkz.inheritence.internal.topic.Topic;

public class TopicRunner {
    public static void main(String[] args) {


        Topic topic =new Topic();
        topic.study();
        topic.exam();
        topic.difficulty();
        topic.syllabus();
        System.out.println("**************************************");
        Topic topic1 =new Mathematics();
        topic1.study();
        topic1.exam();
        topic1.difficulty();
        topic1.syllabus();

        System.out.println("**************************************");
        Mathematics mathematics = new Mathematics();
        mathematics.study();
        mathematics.exam();
        mathematics.difficulty();
        mathematics.syllabus();

        System.out.println("**************************************");
    }
}
