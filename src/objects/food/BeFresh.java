package objects.food;


public enum BeFresh{
            FRESH("свежый"),
            MIDDLEFRESH("немного полежавший"),
            SPOILED("испорченный");

            private final String freshness;
            BeFresh(String freshness){
                this.freshness = freshness;
            }

            @Override
            public String toString() {
                return freshness;
            }
}

