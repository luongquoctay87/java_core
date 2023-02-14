package java8_features;

import java.util.StringJoiner;

public class Java8StringJoiner {

    public static void main(String[] args) {
        StringJoiner joiner1 = new StringJoiner(",");
        joiner1.add("A");
        joiner1.add("B");
        joiner1.add("C");
        joiner1.add("D");
        joiner1.add("E");
        System.out.println(joiner1);

        StringJoiner joiner2 = new StringJoiner(":", "{", "}");
        joiner2.add("X");
        joiner2.add("Y");
        joiner2.add("Z");
        System.out.println(joiner2);

        StringJoiner merge = joiner1.merge(joiner2);
        System.out.println(merge);
        System.out.println(merge.length());
    }

}
