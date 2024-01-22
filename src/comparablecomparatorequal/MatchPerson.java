package comparablecomparatorequal;

    public class MatchPerson {
        private double height;
        private double weight;
        private String ssn;
        private String phoneNumber;

        public MatchPerson(double height, double weight, String ssn, String phoneNumber) {
            this.height = height;
            this.weight = weight;
            this.ssn = ssn;
            this.phoneNumber = phoneNumber;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MatchPerson person = (MatchPerson) obj;
            return ssn != null && ssn.equals(person.ssn);
        }


        public static void main(String[] args) {
            MatchPerson person1 = new MatchPerson(170.0, 70.0, "123-45-6789", "9407581789");
            MatchPerson person2 = new MatchPerson(165.0, 65.0, "987-65-4321", "9010542467");
            MatchPerson person3 = new MatchPerson(175.0, 75.0, "123-45-6789", "9010002824");

            System.out.println("person1 equals person2: " + person1.equals(person2));  // false
            System.out.println("person1 equals person3: " + person1.equals(person3)); //true
        }

    }


