package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVidIdIsNull() {
            addCriterion("vid_id is null");
            return (Criteria) this;
        }

        public Criteria andVidIdIsNotNull() {
            addCriterion("vid_id is not null");
            return (Criteria) this;
        }

        public Criteria andVidIdEqualTo(Integer value) {
            addCriterion("vid_id =", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotEqualTo(Integer value) {
            addCriterion("vid_id <>", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThan(Integer value) {
            addCriterion("vid_id >", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_id >=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThan(Integer value) {
            addCriterion("vid_id <", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThanOrEqualTo(Integer value) {
            addCriterion("vid_id <=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdIn(List<Integer> values) {
            addCriterion("vid_id in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotIn(List<Integer> values) {
            addCriterion("vid_id not in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdBetween(Integer value1, Integer value2) {
            addCriterion("vid_id between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_id not between", value1, value2, "vidId");
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

        public Criteria andVidNameIsNull() {
            addCriterion("vid_name is null");
            return (Criteria) this;
        }

        public Criteria andVidNameIsNotNull() {
            addCriterion("vid_name is not null");
            return (Criteria) this;
        }

        public Criteria andVidNameEqualTo(String value) {
            addCriterion("vid_name =", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotEqualTo(String value) {
            addCriterion("vid_name <>", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameGreaterThan(String value) {
            addCriterion("vid_name >", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameGreaterThanOrEqualTo(String value) {
            addCriterion("vid_name >=", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLessThan(String value) {
            addCriterion("vid_name <", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLessThanOrEqualTo(String value) {
            addCriterion("vid_name <=", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLike(String value) {
            addCriterion("vid_name like", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotLike(String value) {
            addCriterion("vid_name not like", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameIn(List<String> values) {
            addCriterion("vid_name in", values, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotIn(List<String> values) {
            addCriterion("vid_name not in", values, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameBetween(String value1, String value2) {
            addCriterion("vid_name between", value1, value2, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotBetween(String value1, String value2) {
            addCriterion("vid_name not between", value1, value2, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidPathIsNull() {
            addCriterion("vid_path is null");
            return (Criteria) this;
        }

        public Criteria andVidPathIsNotNull() {
            addCriterion("vid_path is not null");
            return (Criteria) this;
        }

        public Criteria andVidPathEqualTo(String value) {
            addCriterion("vid_path =", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathNotEqualTo(String value) {
            addCriterion("vid_path <>", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathGreaterThan(String value) {
            addCriterion("vid_path >", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathGreaterThanOrEqualTo(String value) {
            addCriterion("vid_path >=", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathLessThan(String value) {
            addCriterion("vid_path <", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathLessThanOrEqualTo(String value) {
            addCriterion("vid_path <=", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathLike(String value) {
            addCriterion("vid_path like", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathNotLike(String value) {
            addCriterion("vid_path not like", value, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathIn(List<String> values) {
            addCriterion("vid_path in", values, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathNotIn(List<String> values) {
            addCriterion("vid_path not in", values, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathBetween(String value1, String value2) {
            addCriterion("vid_path between", value1, value2, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidPathNotBetween(String value1, String value2) {
            addCriterion("vid_path not between", value1, value2, "vidPath");
            return (Criteria) this;
        }

        public Criteria andVidDateIsNull() {
            addCriterion("vid_date is null");
            return (Criteria) this;
        }

        public Criteria andVidDateIsNotNull() {
            addCriterion("vid_date is not null");
            return (Criteria) this;
        }

        public Criteria andVidDateEqualTo(Date value) {
            addCriterionForJDBCDate("vid_date =", value, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("vid_date <>", value, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("vid_date >", value, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vid_date >=", value, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateLessThan(Date value) {
            addCriterionForJDBCDate("vid_date <", value, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vid_date <=", value, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateIn(List<Date> values) {
            addCriterionForJDBCDate("vid_date in", values, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("vid_date not in", values, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vid_date between", value1, value2, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vid_date not between", value1, value2, "vidDate");
            return (Criteria) this;
        }

        public Criteria andVidOrderIsNull() {
            addCriterion("vid_order is null");
            return (Criteria) this;
        }

        public Criteria andVidOrderIsNotNull() {
            addCriterion("vid_order is not null");
            return (Criteria) this;
        }

        public Criteria andVidOrderEqualTo(Integer value) {
            addCriterion("vid_order =", value, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderNotEqualTo(Integer value) {
            addCriterion("vid_order <>", value, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderGreaterThan(Integer value) {
            addCriterion("vid_order >", value, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_order >=", value, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderLessThan(Integer value) {
            addCriterion("vid_order <", value, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderLessThanOrEqualTo(Integer value) {
            addCriterion("vid_order <=", value, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderIn(List<Integer> values) {
            addCriterion("vid_order in", values, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderNotIn(List<Integer> values) {
            addCriterion("vid_order not in", values, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderBetween(Integer value1, Integer value2) {
            addCriterion("vid_order between", value1, value2, "vidOrder");
            return (Criteria) this;
        }

        public Criteria andVidOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_order not between", value1, value2, "vidOrder");
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