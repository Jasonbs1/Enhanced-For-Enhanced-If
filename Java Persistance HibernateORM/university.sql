-- Create a new database named University
CREATE DATABASE University;

-- Use the University database
USE University;

-- Create the Student table
CREATE TABLE Student (
    id INT NOT NULL AUTO_INCREMENT, -- Unique identifier for each student
    Name VARCHAR(50) NOT NULL,        -- Name of the student
    Age INT NOT NULL,                  -- Age of the student
    Major VARCHAR(50) NOT NULL,         -- Major of the student
    PRIMARY KEY (id)
);

