package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowExample() {
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

        public Criteria andFolIdIsNull() {
            addCriterion("fol_id is null");
            return (Criteria) this;
        }

        public Criteria andFolIdIsNotNull() {
            addCriterion("fol_id is not null");
            return (Criteria) this;
        }

        public Criteria andFolIdEqualTo(Integer value) {
            addCriterion("fol_id =", value, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdNotEqualTo(Integer value) {
            addCriterion("fol_id <>", value, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdGreaterThan(Integer value) {
            addCriterion("fol_id >", value, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fol_id >=", value, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdLessThan(Integer value) {
            addCriterion("fol_id <", value, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdLessThanOrEqualTo(Integer value) {
            addCriterion("fol_id <=", value, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdIn(List<Integer> values) {
            addCriterion("fol_id in", values, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdNotIn(List<Integer> values) {
            addCriterion("fol_id not in", values, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdBetween(Integer value1, Integer value2) {
            addCriterion("fol_id between", value1, value2, "folId");
            return (Criteria) this;
        }

        public Criteria andFolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fol_id not between", value1, value2, "folId");
            return (Criteria) this;
        }

        public Criteria andFolUserIsNull() {
            addCriterion("fol_user is null");
            return (Criteria) this;
        }

        public Criteria andFolUserIsNotNull() {
            addCriterion("fol_user is not null");
            return (Criteria) this;
        }

        public Criteria andFolUserEqualTo(Integer value) {
            addCriterion("fol_user =", value, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserNotEqualTo(Integer value) {
            addCriterion("fol_user <>", value, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserGreaterThan(Integer value) {
            addCriterion("fol_user >", value, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("fol_user >=", value, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserLessThan(Integer value) {
            addCriterion("fol_user <", value, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserLessThanOrEqualTo(Integer value) {
            addCriterion("fol_user <=", value, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserIn(List<Integer> values) {
            addCriterion("fol_user in", values, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserNotIn(List<Integer> values) {
            addCriterion("fol_user not in", values, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserBetween(Integer value1, Integer value2) {
            addCriterion("fol_user between", value1, value2, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUserNotBetween(Integer value1, Integer value2) {
            addCriterion("fol_user not between", value1, value2, "folUser");
            return (Criteria) this;
        }

        public Criteria andFolUseredIsNull() {
            addCriterion("fol_usered is null");
            return (Criteria) this;
        }

        public Criteria andFolUseredIsNotNull() {
            addCriterion("fol_usered is not null");
            return (Criteria) this;
        }

        public Criteria andFolUseredEqualTo(Integer value) {
            addCriterion("fol_usered =", value, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredNotEqualTo(Integer value) {
            addCriterion("fol_usered <>", value, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredGreaterThan(Integer value) {
            addCriterion("fol_usered >", value, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredGreaterThanOrEqualTo(Integer value) {
            addCriterion("fol_usered >=", value, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredLessThan(Integer value) {
            addCriterion("fol_usered <", value, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredLessThanOrEqualTo(Integer value) {
            addCriterion("fol_usered <=", value, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredIn(List<Integer> values) {
            addCriterion("fol_usered in", values, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredNotIn(List<Integer> values) {
            addCriterion("fol_usered not in", values, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredBetween(Integer value1, Integer value2) {
            addCriterion("fol_usered between", value1, value2, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolUseredNotBetween(Integer value1, Integer value2) {
            addCriterion("fol_usered not between", value1, value2, "folUsered");
            return (Criteria) this;
        }

        public Criteria andFolDateIsNull() {
            addCriterion("fol_date is null");
            return (Criteria) this;
        }

        public Criteria andFolDateIsNotNull() {
            addCriterion("fol_date is not null");
            return (Criteria) this;
        }

        public Criteria andFolDateEqualTo(Date value) {
            addCriterionForJDBCDate("fol_date =", value, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fol_date <>", value, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fol_date >", value, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fol_date >=", value, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateLessThan(Date value) {
            addCriterionForJDBCDate("fol_date <", value, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fol_date <=", value, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateIn(List<Date> values) {
            addCriterionForJDBCDate("fol_date in", values, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fol_date not in", values, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fol_date between", value1, value2, "folDate");
            return (Criteria) this;
        }

        public Criteria andFolDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fol_date not between", value1, value2, "folDate");
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