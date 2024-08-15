package com.example.com.wu.jobproject.repo;

import com.example.com.wu.jobproject.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>();

    public JobRepo() {
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
        jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));
        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));
    }
    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
    }
}
