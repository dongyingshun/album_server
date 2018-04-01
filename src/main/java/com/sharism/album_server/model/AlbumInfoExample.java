package com.sharism.album_server.model;

import java.util.ArrayList;
import java.util.List;

public class AlbumInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAlbumSortIsNull() {
            addCriterion("album_sort is null");
            return (Criteria) this;
        }

        public Criteria andAlbumSortIsNotNull() {
            addCriterion("album_sort is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumSortEqualTo(String value) {
            addCriterion("album_sort =", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortNotEqualTo(String value) {
            addCriterion("album_sort <>", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortGreaterThan(String value) {
            addCriterion("album_sort >", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortGreaterThanOrEqualTo(String value) {
            addCriterion("album_sort >=", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortLessThan(String value) {
            addCriterion("album_sort <", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortLessThanOrEqualTo(String value) {
            addCriterion("album_sort <=", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortLike(String value) {
            addCriterion("album_sort like", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortNotLike(String value) {
            addCriterion("album_sort not like", value, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortIn(List<String> values) {
            addCriterion("album_sort in", values, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortNotIn(List<String> values) {
            addCriterion("album_sort not in", values, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortBetween(String value1, String value2) {
            addCriterion("album_sort between", value1, value2, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumSortNotBetween(String value1, String value2) {
            addCriterion("album_sort not between", value1, value2, "albumSort");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeIsNull() {
            addCriterion("album_type is null");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeIsNotNull() {
            addCriterion("album_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeEqualTo(String value) {
            addCriterion("album_type =", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeNotEqualTo(String value) {
            addCriterion("album_type <>", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeGreaterThan(String value) {
            addCriterion("album_type >", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeGreaterThanOrEqualTo(String value) {
            addCriterion("album_type >=", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeLessThan(String value) {
            addCriterion("album_type <", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeLessThanOrEqualTo(String value) {
            addCriterion("album_type <=", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeLike(String value) {
            addCriterion("album_type like", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeNotLike(String value) {
            addCriterion("album_type not like", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeIn(List<String> values) {
            addCriterion("album_type in", values, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeNotIn(List<String> values) {
            addCriterion("album_type not in", values, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeBetween(String value1, String value2) {
            addCriterion("album_type between", value1, value2, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeNotBetween(String value1, String value2) {
            addCriterion("album_type not between", value1, value2, "albumType");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNull() {
            addCriterion("album_name is null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNotNull() {
            addCriterion("album_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameEqualTo(String value) {
            addCriterion("album_name =", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotEqualTo(String value) {
            addCriterion("album_name <>", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThan(String value) {
            addCriterion("album_name >", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThanOrEqualTo(String value) {
            addCriterion("album_name >=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThan(String value) {
            addCriterion("album_name <", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThanOrEqualTo(String value) {
            addCriterion("album_name <=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLike(String value) {
            addCriterion("album_name like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotLike(String value) {
            addCriterion("album_name not like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIn(List<String> values) {
            addCriterion("album_name in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotIn(List<String> values) {
            addCriterion("album_name not in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameBetween(String value1, String value2) {
            addCriterion("album_name between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotBetween(String value1, String value2) {
            addCriterion("album_name not between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andPrivacySetIsNull() {
            addCriterion("privacy_set is null");
            return (Criteria) this;
        }

        public Criteria andPrivacySetIsNotNull() {
            addCriterion("privacy_set is not null");
            return (Criteria) this;
        }

        public Criteria andPrivacySetEqualTo(Integer value) {
            addCriterion("privacy_set =", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetNotEqualTo(Integer value) {
            addCriterion("privacy_set <>", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetGreaterThan(Integer value) {
            addCriterion("privacy_set >", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetGreaterThanOrEqualTo(Integer value) {
            addCriterion("privacy_set >=", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetLessThan(Integer value) {
            addCriterion("privacy_set <", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetLessThanOrEqualTo(Integer value) {
            addCriterion("privacy_set <=", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetIn(List<Integer> values) {
            addCriterion("privacy_set in", values, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetNotIn(List<Integer> values) {
            addCriterion("privacy_set not in", values, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetBetween(Integer value1, Integer value2) {
            addCriterion("privacy_set between", value1, value2, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetNotBetween(Integer value1, Integer value2) {
            addCriterion("privacy_set not between", value1, value2, "privacySet");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordIsNull() {
            addCriterion("album_password is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordIsNotNull() {
            addCriterion("album_password is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordEqualTo(String value) {
            addCriterion("album_password =", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordNotEqualTo(String value) {
            addCriterion("album_password <>", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordGreaterThan(String value) {
            addCriterion("album_password >", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("album_password >=", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordLessThan(String value) {
            addCriterion("album_password <", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordLessThanOrEqualTo(String value) {
            addCriterion("album_password <=", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordLike(String value) {
            addCriterion("album_password like", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordNotLike(String value) {
            addCriterion("album_password not like", value, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordIn(List<String> values) {
            addCriterion("album_password in", values, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordNotIn(List<String> values) {
            addCriterion("album_password not in", values, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordBetween(String value1, String value2) {
            addCriterion("album_password between", value1, value2, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumPasswordNotBetween(String value1, String value2) {
            addCriterion("album_password not between", value1, value2, "albumPassword");
            return (Criteria) this;
        }

        public Criteria andAlbumIconIsNull() {
            addCriterion("album_icon is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIconIsNotNull() {
            addCriterion("album_icon is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumIconEqualTo(String value) {
            addCriterion("album_icon =", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconNotEqualTo(String value) {
            addCriterion("album_icon <>", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconGreaterThan(String value) {
            addCriterion("album_icon >", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconGreaterThanOrEqualTo(String value) {
            addCriterion("album_icon >=", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconLessThan(String value) {
            addCriterion("album_icon <", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconLessThanOrEqualTo(String value) {
            addCriterion("album_icon <=", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconLike(String value) {
            addCriterion("album_icon like", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconNotLike(String value) {
            addCriterion("album_icon not like", value, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconIn(List<String> values) {
            addCriterion("album_icon in", values, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconNotIn(List<String> values) {
            addCriterion("album_icon not in", values, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconBetween(String value1, String value2) {
            addCriterion("album_icon between", value1, value2, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andAlbumIconNotBetween(String value1, String value2) {
            addCriterion("album_icon not between", value1, value2, "albumIcon");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNull() {
            addCriterion("icon_path is null");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNotNull() {
            addCriterion("icon_path is not null");
            return (Criteria) this;
        }

        public Criteria andIconPathEqualTo(String value) {
            addCriterion("icon_path =", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotEqualTo(String value) {
            addCriterion("icon_path <>", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThan(String value) {
            addCriterion("icon_path >", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThanOrEqualTo(String value) {
            addCriterion("icon_path >=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThan(String value) {
            addCriterion("icon_path <", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThanOrEqualTo(String value) {
            addCriterion("icon_path <=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLike(String value) {
            addCriterion("icon_path like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotLike(String value) {
            addCriterion("icon_path not like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathIn(List<String> values) {
            addCriterion("icon_path in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotIn(List<String> values) {
            addCriterion("icon_path not in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathBetween(String value1, String value2) {
            addCriterion("icon_path between", value1, value2, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotBetween(String value1, String value2) {
            addCriterion("icon_path not between", value1, value2, "iconPath");
            return (Criteria) this;
        }

        public Criteria andShowStyleIsNull() {
            addCriterion("show_style is null");
            return (Criteria) this;
        }

        public Criteria andShowStyleIsNotNull() {
            addCriterion("show_style is not null");
            return (Criteria) this;
        }

        public Criteria andShowStyleEqualTo(String value) {
            addCriterion("show_style =", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotEqualTo(String value) {
            addCriterion("show_style <>", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleGreaterThan(String value) {
            addCriterion("show_style >", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleGreaterThanOrEqualTo(String value) {
            addCriterion("show_style >=", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleLessThan(String value) {
            addCriterion("show_style <", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleLessThanOrEqualTo(String value) {
            addCriterion("show_style <=", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleLike(String value) {
            addCriterion("show_style like", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotLike(String value) {
            addCriterion("show_style not like", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleIn(List<String> values) {
            addCriterion("show_style in", values, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotIn(List<String> values) {
            addCriterion("show_style not in", values, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleBetween(String value1, String value2) {
            addCriterion("show_style between", value1, value2, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotBetween(String value1, String value2) {
            addCriterion("show_style not between", value1, value2, "showStyle");
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