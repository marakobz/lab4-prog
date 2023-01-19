package objects.entities;

public class Person {
    private String name, room;

    public Person(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public interface SpotContainer {
        String getRoom();
    }

    public SpotContainer getSpotsContainer() {
        class PersonSpotContainer implements SpotContainer {
            final String room = Person.this.room;

            @Override
            public String getRoom() {
                return this.room;
            }

        }
        return new PersonSpotContainer();
    }

}
