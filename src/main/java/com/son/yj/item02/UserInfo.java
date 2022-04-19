package com.son.yj.item02;

public class UserInfo {
    private String name;
    private Integer age;

    private String phone;
    private String email;
    private Boolean sex;

    public static class Builder {
        // 필수 !!
        private String name;
        private Integer age;

        // option
        private String phone;
        private String email;
        private Boolean sex;

        public Builder(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setSex(Boolean sex) {
            this.sex = sex;
            return this;
        }

        public UserInfo build() throws IllegalArgumentException{
            validate();
            return new UserInfo(this);
        }

        private void validate() throws IllegalArgumentException{
            boolean result = true;

            if ("".equals(this.name) || this.name == null) {
                throw new IllegalArgumentException("name illegal");
            }
        }

    }

    public UserInfo(Builder builder) {

        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.email = builder.email;
        this.sex = builder.sex;

    }

    public static void main(String[] args) {
        UserInfo userInfo = new Builder("son", 32)
            .build();
    }

}
