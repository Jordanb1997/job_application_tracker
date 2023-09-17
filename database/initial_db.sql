-- create application table
create table applications(
    application_id int not null,
    company_name varchar(255) not null,
    job_title varchar(255),
    job_location varchar(50),
    experience_level varchar(50),
    salary varchar(50),
    employment_type varchar(50),
    onsite_policy varchar(50),
    application_date date,
    description varchar(max),
    application_status varchar(50),
    response_date date,
    notes varchar(255),
    primary key (application_id)
);