package com.topline.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNull() {
            addCriterion("dateOfBirth is null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNotNull() {
            addCriterion("dateOfBirth is not null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthEqualTo(Date value) {
            addCriterion("dateOfBirth =", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotEqualTo(Date value) {
            addCriterion("dateOfBirth <>", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThan(Date value) {
            addCriterion("dateOfBirth >", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThanOrEqualTo(Date value) {
            addCriterion("dateOfBirth >=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThan(Date value) {
            addCriterion("dateOfBirth <", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThanOrEqualTo(Date value) {
            addCriterion("dateOfBirth <=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIn(List<Date> values) {
            addCriterion("dateOfBirth in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotIn(List<Date> values) {
            addCriterion("dateOfBirth not in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthBetween(Date value1, Date value2) {
            addCriterion("dateOfBirth between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotBetween(Date value1, Date value2) {
            addCriterion("dateOfBirth not between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNull() {
            addCriterion("emailAddress is null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNotNull() {
            addCriterion("emailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressEqualTo(String value) {
            addCriterion("emailAddress =", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotEqualTo(String value) {
            addCriterion("emailAddress <>", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThan(String value) {
            addCriterion("emailAddress >", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("emailAddress >=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThan(String value) {
            addCriterion("emailAddress <", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThanOrEqualTo(String value) {
            addCriterion("emailAddress <=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLike(String value) {
            addCriterion("emailAddress like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotLike(String value) {
            addCriterion("emailAddress not like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIn(List<String> values) {
            addCriterion("emailAddress in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotIn(List<String> values) {
            addCriterion("emailAddress not in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressBetween(String value1, String value2) {
            addCriterion("emailAddress between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotBetween(String value1, String value2) {
            addCriterion("emailAddress not between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstName =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstName <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstName >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstName >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstName <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstName <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstName like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstName not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstName in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstName not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstName between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstName not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("lastName is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastName =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastName <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastName >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastName >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastName <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastName <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastName like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastName not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastName in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastName not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastName between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastName not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbggenerated do_not_delete_during_merge Wed Apr 22 15:31:02 EAT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbggenerated Wed Apr 22 15:31:02 EAT 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}