import java.util.*;

public class TouristUaPlaces implements Collection, IterableRating, IterableGuideRating {

    private List<TouristPlace> items = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(" === start === ");
        TouristUaPlaces places = new TouristUaPlaces();
        places.add(new TouristPlace("name_1", 3, 2));
        places.add(new TouristPlace("name_2", 2, 3));
        places.add(new TouristPlace("name_3", 1, 1));

        Iterator iterator = places.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = places.iteratorRating();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = places.iteratorGuideRating();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public void add(TouristPlace touristUaPlace) {
        items.add(touristUaPlace);
    }

    @Override
    public Iterator iterator() {
        return new DefaultIterator(items);
    }

    @Override
    public Iterator iteratorRating() {
        return new RatingIterator(items);
    }

    @Override
    public Iterator iteratorGuideRating() {
        return new GuideRatingIterator(items);
    }
}

class TouristPlace {
    String placeName;
    float rating;
    float guideRating;

    public TouristPlace(String placeName, float rating, float guideRating) {
        this.placeName = placeName;
        this.rating = rating;
        this.guideRating = guideRating;
    }

    public float getRating() {
        return rating;
    }

    public float getGuideRating() {
        return guideRating;
    }

    @Override
    public String toString() {
        return "TouristPlace{" +
                "placeName='" + placeName + '\'' +
                ", rating=" + rating +
                ", guideRating=" + guideRating +
                '}';
    }
}

interface Collection extends Iterable {
    void add(TouristPlace touristUaPlace);
}

interface Iterator {
    boolean hasNext();
    TouristPlace next();
}

interface Iterable {
    Iterator iterator();
}

interface IterableRating extends Iterable {
    Iterator iteratorRating();
}

interface IterableGuideRating extends Iterable {
    Iterator iteratorGuideRating();
}

class DefaultIterator implements Iterator {

    private List<TouristPlace> items;
    private int index = 0;

    public DefaultIterator(List<TouristPlace> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public TouristPlace next() {
        if (index >= items.size()) {
            throw new IndexOutOfBoundsException();
        }
        return items.get(index++);
    }
}

class RatingIterator implements Iterator {

    private java.util.Iterator<TouristPlace> iterator;

    public RatingIterator(List<TouristPlace> items) {
        Set<TouristPlace> set = new TreeSet<>(Comparator.comparing(TouristPlace::getRating));
        set.addAll(items);
        this.iterator = set.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public TouristPlace next() {
        return iterator.next();
    }
}

class GuideRatingIterator implements Iterator {

    private java.util.Iterator<TouristPlace> iterator;

    public GuideRatingIterator(List<TouristPlace> items) {
        Set<TouristPlace> set = new TreeSet<>(Comparator.comparing(TouristPlace::getGuideRating));
        set.addAll(items);
        this.iterator = set.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public TouristPlace next() {
        return iterator.next();
    }
}



