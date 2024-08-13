/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collegeinfo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author mohit kumar
 */
@Entity
@Table(name = "NEW_STUDENT", catalog = "", schema = "MOHIT")
@NamedQueries({
    @NamedQuery(name = "NewStudent.findAll", query = "SELECT n FROM NewStudent n"),
    @NamedQuery(name = "NewStudent.findByStdName", query = "SELECT n FROM NewStudent n WHERE n.stdName = :stdName"),
    @NamedQuery(name = "NewStudent.findByMobileNumber", query = "SELECT n FROM NewStudent n WHERE n.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "NewStudent.findByEmailId", query = "SELECT n FROM NewStudent n WHERE n.emailId = :emailId"),
    @NamedQuery(name = "NewStudent.findByAge", query = "SELECT n FROM NewStudent n WHERE n.age = :age"),
    @NamedQuery(name = "NewStudent.findByBranch", query = "SELECT n FROM NewStudent n WHERE n.branch = :branch"),
    @NamedQuery(name = "NewStudent.findByDateOfBirth", query = "SELECT n FROM NewStudent n WHERE n.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "NewStudent.findByCourse", query = "SELECT n FROM NewStudent n WHERE n.course = :course"),
    @NamedQuery(name = "NewStudent.findByAddress", query = "SELECT n FROM NewStudent n WHERE n.address = :address"),
    @NamedQuery(name = "NewStudent.findByAdharNumber", query = "SELECT n FROM NewStudent n WHERE n.adharNumber = :adharNumber"),
    @NamedQuery(name = "NewStudent.findByFatherName", query = "SELECT n FROM NewStudent n WHERE n.fatherName = :fatherName"),
    @NamedQuery(name = "NewStudent.findByBloodGroup", query = "SELECT n FROM NewStudent n WHERE n.bloodGroup = :bloodGroup"),
    @NamedQuery(name = "NewStudent.findByCast", query = "SELECT n FROM NewStudent n WHERE n.cast = :cast"),
    @NamedQuery(name = "NewStudent.findByAdmissionDate", query = "SELECT n FROM NewStudent n WHERE n.admissionDate = :admissionDate"),
    @NamedQuery(name = "NewStudent.findByStdId", query = "SELECT n FROM NewStudent n WHERE n.stdId = :stdId")})
public class NewStudent implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STD_NAME")
    private String stdName;
    @Column(name = "MOBILE_NUMBER")
    private BigInteger mobileNumber;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "AGE")
    private BigInteger age;
    @Column(name = "BRANCH")
    private String branch;
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @Column(name = "COURSE")
    private String course;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "ADHAR_NUMBER")
    private BigInteger adharNumber;
    @Column(name = "FATHER_NAME")
    private String fatherName;
    @Column(name = "BLOOD_GROUP")
    private String bloodGroup;
    @Column(name = "CAST")
    private String cast;
    @Column(name = "ADMISSION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date admissionDate;
    @Column(name = "STD_ID")
    private BigInteger stdId;

    public NewStudent() {
    }

    public NewStudent(String stdName) {
        this.stdName = stdName;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        String oldStdName = this.stdName;
        this.stdName = stdName;
        changeSupport.firePropertyChange("stdName", oldStdName, stdName);
    }

    public BigInteger getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(BigInteger mobileNumber) {
        BigInteger oldMobileNumber = this.mobileNumber;
        this.mobileNumber = mobileNumber;
        changeSupport.firePropertyChange("mobileNumber", oldMobileNumber, mobileNumber);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        String oldEmailId = this.emailId;
        this.emailId = emailId;
        changeSupport.firePropertyChange("emailId", oldEmailId, emailId);
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(BigInteger age) {
        BigInteger oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        Date oldDateOfBirth = this.dateOfBirth;
        this.dateOfBirth = dateOfBirth;
        changeSupport.firePropertyChange("dateOfBirth", oldDateOfBirth, dateOfBirth);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public BigInteger getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(BigInteger adharNumber) {
        BigInteger oldAdharNumber = this.adharNumber;
        this.adharNumber = adharNumber;
        changeSupport.firePropertyChange("adharNumber", oldAdharNumber, adharNumber);
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        String oldFatherName = this.fatherName;
        this.fatherName = fatherName;
        changeSupport.firePropertyChange("fatherName", oldFatherName, fatherName);
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        String oldBloodGroup = this.bloodGroup;
        this.bloodGroup = bloodGroup;
        changeSupport.firePropertyChange("bloodGroup", oldBloodGroup, bloodGroup);
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        String oldCast = this.cast;
        this.cast = cast;
        changeSupport.firePropertyChange("cast", oldCast, cast);
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        Date oldAdmissionDate = this.admissionDate;
        this.admissionDate = admissionDate;
        changeSupport.firePropertyChange("admissionDate", oldAdmissionDate, admissionDate);
    }

    public BigInteger getStdId() {
        return stdId;
    }

    public void setStdId(BigInteger stdId) {
        BigInteger oldStdId = this.stdId;
        this.stdId = stdId;
        changeSupport.firePropertyChange("stdId", oldStdId, stdId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stdName != null ? stdName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewStudent)) {
            return false;
        }
        NewStudent other = (NewStudent) object;
        if ((this.stdName == null && other.stdName != null) || (this.stdName != null && !this.stdName.equals(other.stdName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "collegeinfo.NewStudent[ stdName=" + stdName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
