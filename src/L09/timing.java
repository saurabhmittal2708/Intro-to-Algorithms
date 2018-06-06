/*
 * L09.timing
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L09;

public class timing
{
    public static void main(String[] args)
    {
        String s="Functional analysis is an abstract branch of mathematics";
        String t="Functional analysis is an abstract branch of mathematics that originated\n" +
                "from classical analysis. Its development started about eighty\n" +
                "years ago, and nowadays functional analytic methods and results are\n" +
                "important in various fields of mathematics and its applications. The\n" +
                "impetus came from linear algebra, linear ordinary and partial differential\n" +
                "equations, calculus of variations, approximation theory and, in\n" +
                "particular, linear integral equations, whose theory had the greatest\n" +
                "effect on the development and promotion of the modern ideas.\n" +
                "Mathematicians observed that problems from different fields often\n" +
                "enjoy related features and properties. This fact was used for an\n" +
                "effective unifying approach towards such problems, the unification\n" +
                "being obtained by the omission of unessential details. Hence the\n" +
                "advantage of such an abstract approach is that it concentrates on the\n" +
                "essential facts, so that these facts become clearly visible since the\n" +
                "investigator's attention is not disturbed by unimportant details. In this\n" +
                "respect the abstract method is the simplest and most economical\n" +
                "method for treating mathematical systems. Since any such abstract\n" +
                "system will, in general, have various concrete realizations (concrete\n" +
                "models), we see that the abstract method is quite versatile in its\n" +
                "application to concrete situations. It helps to free the problem from\n" +
                "isolation and creates relations and transitions between fields which\n" +
                "have at first no contact with one another.\n" +
                "In the abstract approach, one usually starts from a set of elements\n" +
                "satisfying certain axioms. The nature of the elements is left unspecified.\n" +
                "This is done on purpose. The theory then consists of logical consequences\n" +
                "which result from the axioms and are derived as theorems once\n" +
                "and for all. This means that in this axiomatic fashion one obtains a\n" +
                "mathematical structure whose theory is developed in an abstract way.\n" +
                "Those general theorems can then later be applied to various special\n" +
                "sets satisfying those axioms.\n" +
                "For example, in algebra this approach is used in connection with\n" +
                "fields, rings and groups. In functional analysis we use it in connection\n" +
                "with abstract spaces; these are of basic importance, and we shall\n" +
                "consider some of them (Banach spaces, Hilbert spaces) in great detail.\n" +
                "We shall see that in this connection the concept of a \"space\" is used in \n" +
                "2 Metrk Spac('s\n" +
                "a very wide and surprisingly general sensc. An abstract space will hc a\n" +
                "set of (unspecified) elements satisfying certain axioms. And by choosing\n" +
                "different sets of axioms we shall obtain different types of ahstract\n" +
                "spaces.\n" +
                "The idea of using abstract spaces in a systematic fashion goes back\n" +
                "to M. Frechet (1906)1 and is justified by its great success.\n" +
                "In this chapter we consider metric spaces. These are fundamental\n" +
                "in functional analysis because they play a role similar to that of the real\n" +
                "line R in calculus. In fact, they generalize R and have been created in\n" +
                "order to provide a basis for a unified treatment of important problems\n" +
                "from various branches of analysis.\n" +
                "We first define metric spaces and related concepts and illustrate\n" +
                "them with typical examples. Special spaces of practical importance are\n" +
                "discussed in detail. Much attention is paid to the concept of completeness,\n" +
                "a property which a metric space mayor may not have. Completeness\n" +
                "will play a key role throughout the book.\n" +
                "Important concepts, brief orientation about main content\n" +
                "A metric space (cf. 1.1-1) is a set X with a metric on it. The metric\n" +
                "associates with any pair of elements (points) of X a distance. The\n" +
                "metric is defined axiomatically, the axioms being suggested by certain\n" +
                "simple properties of the familiar distance between points on the real\n" +
                "line R and the complex plane C. Basic examples (1.1-2 to 1.2-3) show\n" +
                "that the concept of a metric space is remarkably general. A very\n" +
                "important additional property which a metric space may have is\n" +
                "completeness (cf. 1.4-3), which is discussed in detail in Secs. 1.5 and\n" +
                "1.6. Another concept of theoretical and practical interest is separability\n" +
                "of a metric space (cf. 1.3-5). Separable metric spaces are simpler than\n" +
                "nonseparable ones.\n" +
                "1.1 Metric Space\n" +
                "In calculus we study functions defined on the real line R. A little\n" +
                "reflection shows that in limit processes and many other considerations\n" +
                "we use the fact that on R we have available a distance function, call it\n" +
                "d, which associates a distance d(x, y) = Ix - yl with every pair of points\n" +
                "I References are given in Appendix 3, and we shall refer to books and papers listed\n" +
                "in Appendix 3 as is shown here. \n" +
                "1.1 Metric Space\n" +
                "II-< ... O------5---i::>~1\n" +
                "I I\n" +
                "3 8\n" +
                "d(3, 8) = 13 - 8 I = 5\n" +
                "~4.2~\n" +
                "I I I\n" +
                "-2.5 o 1.7\n" +
                "d(1.7, - 2.5) = 11.7 - (-2.5) 1= 4.2\n" +
                "Fig. 2. Distance on R\n" +
                "3\n" +
                "x, Y E R. Figure 2 illustrates the notation. In the plane and in \"ordinary;'\n" +
                "three-dimensional space the situation is similar.\n" +
                "In functional analysis we shall study more general \"spaces\" and\n" +
                "\"functions\" defined on them. We arrive at a sufficiently general and\n" +
                "flexible concept of a \"space\" as follows. We replace the set of real\n" +
                "numbers underlying R by an abstract set X (set of elements whose\n" +
                "nature is left unspecified) and introduce on X a \"distance function\"\n" +
                "which has only a few of the most fundamental properties of the\n" +
                "distance function on R. But what do we mean by \"most fundamental\"?\n" +
                "This question is far from being trivial. In fact, the choice and formulation\n" +
                "of axioms in a definition always needs experience, familiarity with\n" +
                "practical problems and a clear idea of the goal to be reached. In the\n" +
                "present case, a development of over sixty years has led to the following\n" +
                "concept which is basic and very useful in functional analysis and its\n" +
                "applications.\n" +
                "1.1-1 Definition (Metric space, metric). A metric space is a pair\n" +
                "(X, d), where X is a set and d is a metric on X (or distance function on\n" +
                "X), that is, a function defined2 on X x X such that for all x, y, z E X we\n" +
                "have:\n" +
                "(M1) d is real-valued, finite and nonnegative.\n" +
                "(M2)\n" +
                "(M3)\n" +
                "(M4)\n" +
                "d(x, y)=O if and only if\n" +
                "d(x, y) = dey, x)\n" +
                "d(x, y)~d(x, z)+d(z, y)\n" +
                "x=y.\n" +
                "(Symmetry).\n" +
                "(Triangle inequality). •\n" +
                "1 The symbol x denotes the Cartesian product of sets: A xB is the set of all order~d\n" +
                "pairs (a, b), where a E A and be B. Hence X x X is the set of all ordered pairs of\n" +
                "clements of X. \n" +
                "4 Metric Spaces\n" +
                "A few related terms are as follows. X is usually called the\n" +
                "underlying set of (X, d). Its elements are called points. For fixed x, y we\n" +
                "call the nonnegative number d(x, y) the distance from x to y. Properties\n" +
                "(Ml) to (M4) are the axioms of a metric. The name \"triangle\n" +
                "inequality\" is motivated by elementary geometry as shown in Fig. 3. ";
        t=t.concat(t.concat(t.concat(t.concat(t.concat(t.concat(t.concat(t.concat(t))))))));
        t=t.concat(t);
        t=t.concat(t);

        long t0= System.nanoTime();
        System.out.println(new karpRabin().Search(s,t));
        long t1= System.nanoTime();
        System.out.println("KarpRabin   in "+(t1-t0)/1000000+" ms");
        t0=System.nanoTime();
        System.out.println(new karpRabinV2().Search(s,t));
        t1=System.nanoTime();
        System.out.println("KarpRabinV2 in "+(t1-t0)/1000000+" ms");
    }
}
