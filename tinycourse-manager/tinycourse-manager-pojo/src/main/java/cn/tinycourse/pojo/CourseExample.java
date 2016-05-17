package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdIsNull() {
            addCriterion("cour_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdIsNotNull() {
            addCriterion("cour_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdEqualTo(Integer value) {
            addCriterion("cour_type_id =", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdNotEqualTo(Integer value) {
            addCriterion("cour_type_id <>", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdGreaterThan(Integer value) {
            addCriterion("cour_type_id >", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_type_id >=", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdLessThan(Integer value) {
            addCriterion("cour_type_id <", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cour_type_id <=", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdIn(List<Integer> values) {
            addCriterion("cour_type_id in", values, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdNotIn(List<Integer> values) {
            addCriterion("cour_type_id not in", values, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cour_type_id between", value1, value2, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_type_id not between", value1, value2, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNull() {
            addCriterion("cour_name is null");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNotNull() {
            addCriterion("cour_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourNameEqualTo(String value) {
            addCriterion("cour_name =", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotEqualTo(String value) {
            addCriterion("cour_name <>", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThan(String value) {
            addCriterion("cour_name >", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThanOrEqualTo(String value) {
            addCriterion("cour_name >=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThan(String value) {
            addCriterion("cour_name <", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThanOrEqualTo(String value) {
            addCriterion("cour_name <=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLike(String value) {
            addCriterion("cour_name like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotLike(String value) {
            addCriterion("cour_name not like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameIn(List<String> values) {
            addCriterion("cour_name in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotIn(List<String> values) {
            addCriterion("cour_name not in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameBetween(String value1, String value2) {
            addCriterion("cour_name between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotBetween(String value1, String value2) {
            addCriterion("cour_name not between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andCourStuIsNull() {
            addCriterion("cour_stu is null");
            return (Criteria) this;
        }

        public Criteria andCourStuIsNotNull() {
            addCriterion("cour_stu is not null");
            return (Criteria) this;
        }

        public Criteria andCourStuEqualTo(Integer value) {
            addCriterion("cour_stu =", value, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuNotEqualTo(Integer value) {
            addCriterion("cour_stu <>", value, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuGreaterThan(Integer value) {
            addCriterion("cour_stu >", value, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_stu >=", value, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuLessThan(Integer value) {
            addCriterion("cour_stu <", value, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuLessThanOrEqualTo(Integer value) {
            addCriterion("cour_stu <=", value, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuIn(List<Integer> values) {
            addCriterion("cour_stu in", values, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuNotIn(List<Integer> values) {
            addCriterion("cour_stu not in", values, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuBetween(Integer value1, Integer value2) {
            addCriterion("cour_stu between", value1, value2, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourStuNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_stu not between", value1, value2, "courStu");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionIsNull() {
            addCriterion("cour_description is null");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionIsNotNull() {
            addCriterion("cour_description is not null");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionEqualTo(String value) {
            addCriterion("cour_description =", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionNotEqualTo(String value) {
            addCriterion("cour_description <>", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionGreaterThan(String value) {
            addCriterion("cour_description >", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("cour_description >=", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionLessThan(String value) {
            addCriterion("cour_description <", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionLessThanOrEqualTo(String value) {
            addCriterion("cour_description <=", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionLike(String value) {
            addCriterion("cour_description like", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionNotLike(String value) {
            addCriterion("cour_description not like", value, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionIn(List<String> values) {
            addCriterion("cour_description in", values, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionNotIn(List<String> values) {
            addCriterion("cour_description not in", values, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionBetween(String value1, String value2) {
            addCriterion("cour_description between", value1, value2, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourDescriptionNotBetween(String value1, String value2) {
            addCriterion("cour_description not between", value1, value2, "courDescription");
            return (Criteria) this;
        }

        public Criteria andCourGradeIsNull() {
            addCriterion("cour_grade is null");
            return (Criteria) this;
        }

        public Criteria andCourGradeIsNotNull() {
            addCriterion("cour_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCourGradeEqualTo(Integer value) {
            addCriterion("cour_grade =", value, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeNotEqualTo(Integer value) {
            addCriterion("cour_grade <>", value, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeGreaterThan(Integer value) {
            addCriterion("cour_grade >", value, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_grade >=", value, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeLessThan(Integer value) {
            addCriterion("cour_grade <", value, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeLessThanOrEqualTo(Integer value) {
            addCriterion("cour_grade <=", value, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeIn(List<Integer> values) {
            addCriterion("cour_grade in", values, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeNotIn(List<Integer> values) {
            addCriterion("cour_grade not in", values, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeBetween(Integer value1, Integer value2) {
            addCriterion("cour_grade between", value1, value2, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_grade not between", value1, value2, "courGrade");
            return (Criteria) this;
        }

        public Criteria andCourImageIsNull() {
            addCriterion("cour_image is null");
            return (Criteria) this;
        }

        public Criteria andCourImageIsNotNull() {
            addCriterion("cour_image is not null");
            return (Criteria) this;
        }

        public Criteria andCourImageEqualTo(String value) {
            addCriterion("cour_image =", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotEqualTo(String value) {
            addCriterion("cour_image <>", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageGreaterThan(String value) {
            addCriterion("cour_image >", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageGreaterThanOrEqualTo(String value) {
            addCriterion("cour_image >=", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageLessThan(String value) {
            addCriterion("cour_image <", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageLessThanOrEqualTo(String value) {
            addCriterion("cour_image <=", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageLike(String value) {
            addCriterion("cour_image like", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotLike(String value) {
            addCriterion("cour_image not like", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageIn(List<String> values) {
            addCriterion("cour_image in", values, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotIn(List<String> values) {
            addCriterion("cour_image not in", values, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageBetween(String value1, String value2) {
            addCriterion("cour_image between", value1, value2, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotBetween(String value1, String value2) {
            addCriterion("cour_image not between", value1, value2, "courImage");
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