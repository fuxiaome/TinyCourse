package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SelectCourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelectCourExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSelCourIdIsNull() {
            addCriterion("sel_cour_id is null");
            return (Criteria) this;
        }

        public Criteria andSelCourIdIsNotNull() {
            addCriterion("sel_cour_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelCourIdEqualTo(Integer value) {
            addCriterion("sel_cour_id =", value, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdNotEqualTo(Integer value) {
            addCriterion("sel_cour_id <>", value, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdGreaterThan(Integer value) {
            addCriterion("sel_cour_id >", value, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sel_cour_id >=", value, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdLessThan(Integer value) {
            addCriterion("sel_cour_id <", value, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdLessThanOrEqualTo(Integer value) {
            addCriterion("sel_cour_id <=", value, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdIn(List<Integer> values) {
            addCriterion("sel_cour_id in", values, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdNotIn(List<Integer> values) {
            addCriterion("sel_cour_id not in", values, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdBetween(Integer value1, Integer value2) {
            addCriterion("sel_cour_id between", value1, value2, "selCourId");
            return (Criteria) this;
        }

        public Criteria andSelCourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sel_cour_id not between", value1, value2, "selCourId");
            return (Criteria) this;
        }

        public Criteria andCourIdIsNull() {
            addCriterion("cour_id is null");
            return (Criteria) this;
        }

        public Criteria andCourIdIsNotNull() {
            addCriterion("cour_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourIdEqualTo(Integer value) {
            addCriterion("cour_id =", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotEqualTo(Integer value) {
            addCriterion("cour_id <>", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdGreaterThan(Integer value) {
            addCriterion("cour_id >", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_id >=", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdLessThan(Integer value) {
            addCriterion("cour_id <", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdLessThanOrEqualTo(Integer value) {
            addCriterion("cour_id <=", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdIn(List<Integer> values) {
            addCriterion("cour_id in", values, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotIn(List<Integer> values) {
            addCriterion("cour_id not in", values, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdBetween(Integer value1, Integer value2) {
            addCriterion("cour_id between", value1, value2, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_id not between", value1, value2, "courId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSelCourDateIsNull() {
            addCriterion("sel_cour_date is null");
            return (Criteria) this;
        }

        public Criteria andSelCourDateIsNotNull() {
            addCriterion("sel_cour_date is not null");
            return (Criteria) this;
        }

        public Criteria andSelCourDateEqualTo(Date value) {
            addCriterionForJDBCDate("sel_cour_date =", value, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sel_cour_date <>", value, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sel_cour_date >", value, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sel_cour_date >=", value, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateLessThan(Date value) {
            addCriterionForJDBCDate("sel_cour_date <", value, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sel_cour_date <=", value, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateIn(List<Date> values) {
            addCriterionForJDBCDate("sel_cour_date in", values, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sel_cour_date not in", values, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sel_cour_date between", value1, value2, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sel_cour_date not between", value1, value2, "selCourDate");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleIsNull() {
            addCriterion("sel_cour_schedule is null");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleIsNotNull() {
            addCriterion("sel_cour_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleEqualTo(Integer value) {
            addCriterion("sel_cour_schedule =", value, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleNotEqualTo(Integer value) {
            addCriterion("sel_cour_schedule <>", value, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleGreaterThan(Integer value) {
            addCriterion("sel_cour_schedule >", value, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("sel_cour_schedule >=", value, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleLessThan(Integer value) {
            addCriterion("sel_cour_schedule <", value, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("sel_cour_schedule <=", value, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleIn(List<Integer> values) {
            addCriterion("sel_cour_schedule in", values, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleNotIn(List<Integer> values) {
            addCriterion("sel_cour_schedule not in", values, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleBetween(Integer value1, Integer value2) {
            addCriterion("sel_cour_schedule between", value1, value2, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("sel_cour_schedule not between", value1, value2, "selCourSchedule");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneIsNull() {
            addCriterion("sel_cour_done is null");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneIsNotNull() {
            addCriterion("sel_cour_done is not null");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneEqualTo(Integer value) {
            addCriterion("sel_cour_done =", value, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneNotEqualTo(Integer value) {
            addCriterion("sel_cour_done <>", value, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneGreaterThan(Integer value) {
            addCriterion("sel_cour_done >", value, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("sel_cour_done >=", value, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneLessThan(Integer value) {
            addCriterion("sel_cour_done <", value, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneLessThanOrEqualTo(Integer value) {
            addCriterion("sel_cour_done <=", value, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneIn(List<Integer> values) {
            addCriterion("sel_cour_done in", values, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneNotIn(List<Integer> values) {
            addCriterion("sel_cour_done not in", values, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneBetween(Integer value1, Integer value2) {
            addCriterion("sel_cour_done between", value1, value2, "selCourDone");
            return (Criteria) this;
        }

        public Criteria andSelCourDoneNotBetween(Integer value1, Integer value2) {
            addCriterion("sel_cour_done not between", value1, value2, "selCourDone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}