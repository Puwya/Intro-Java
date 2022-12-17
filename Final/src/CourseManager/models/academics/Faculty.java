package CourseManager.models.academics;

import java.util.ArrayList;
import java.util.UUID;

import CourseManager.models.education.Course;
import CourseManager.models.education.Session;

public class Faculty extends Person {
  public Faculty(UUID id, String firstName, String middleName, String lastName, String email, String number,
      Address address, String hireDate, boolean tenured) {
    super(id, firstName, middleName, lastName, email, number, address);
    m_hireDate = hireDate;
    m_tenured = tenured;
    m_courses = new ArrayList<Course>();
    m_sessions = new ArrayList<Session>();
  }

  public String getHireDate() {
    return m_hireDate;
  }

  public void setHireDate(String hireDate) {
    m_hireDate = hireDate;
  }

  public boolean isTenured() {
    return m_tenured;
  }

  public void setTenured(boolean tenured) {
    m_tenured = tenured;
  }

  public ArrayList<Course> getCourses() {
    return m_courses;
  }

  public void addCourse(Course course) {
    m_courses.add(course);
  }

  public ArrayList<Session> getSessions() {
    return m_sessions;
  }

  public void addSession(Session session) {
    m_sessions.add(session);
  }

  private String m_hireDate;
  private boolean m_tenured;
  private ArrayList<Course> m_courses;
  private ArrayList<Session> m_sessions;
}
