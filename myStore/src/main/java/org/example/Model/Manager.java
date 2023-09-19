package org.example.Model;
    public class Manager extends Staff {
        private String hire;
        private String train;

        public Manager(String name, long employeeId, String startDate, String title, String dateOfBirth, String maritalStatus, String citizenship, String address, String courseOfStudy, String email, String experience) {
            super(name, employeeId, startDate, title, dateOfBirth, maritalStatus, citizenship, address, courseOfStudy, email, experience);
            this.hire = hire;
            this.train = train;

        }

        public String getHire() {
            return hire;
        }

        public void setHire(String hire) {
            this.hire = hire;
        }

        public void setTrain(String train) {
            this.train = train;
        }

        public String getTrain() {
            return train;
        }

        @Override
        public String toString() {
            return "Manager{" +
                    "hire='" + hire + '\'' +
                    ", train='" + train + '\'' +
                    '}';
        }
    }

