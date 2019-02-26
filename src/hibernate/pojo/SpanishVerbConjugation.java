package hibernate.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import control.Global;

import javax.persistence.*;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "tblSpanishVerbConjugation")
public class SpanishVerbConjugation implements HibernateObject {

    //region Column Mappings
    @Id
    @Column(name = "fstrInfinitive")
    private String strInfinitive = "";

    @Column(name = "fstrGerund")
    private String strGerund = "";

    @Column(name = "fstrPastParticipleMasculineSingular")
    private String strPastParticipleMasculineSingular = "";

    @Column(name = "fstrPastParticipleFeminineSingular")
    private String strPastParticipleFeminineSingular = "";

    @Column(name = "fstrPastParticipleMasculinePlural")
    private String strPastParticipleMasculinePlural = "";

    @Column(name = "fstrPastParticipleFemininePlural")
    private String strPastParticipleFemininePlural = "";

    @Column(name = "fstrIndicativePresentYo")
    private String strIndicativePresentYo = "";

    @Column(name = "fstrIndicativePresentTu")
    private String strIndicativePresentTu = "";

    @Column(name = "fstrIndicativePresentUsted")
    private String strIndicativePresentUsted = "";

    @Column(name = "fstrIndicativePresentNosotros")
    private String strIndicativePresentNosotros = "";

    @Column(name = "fstrIndicativePresentVosotros")
    private String strIndicativePresentVosotros = "";

    @Column(name = "fstrIndicativePresentEllos")
    private String strIndicativePresentEllos = "";

    @Column(name = "fstrIndicativeImperfectYo")
    private String strIndicativeImperfectYo = "";

    @Column(name = "fstrIndicativeImperfectTu")
    private String strIndicativeImperfectTu = "";

    @Column(name = "fstrIndicativeImperfectUsted")
    private String strIndicativeImperfectUsted = "";

    @Column(name = "fstrIndicativeImperfectNosotros")
    private String strIndicativeImperfectNosotros = "";

    @Column(name = "fstrIndicativeImperfectVosotros")
    private String strIndicativeImperfectVosotros = "";

    @Column(name = "fstrIndicativeImperfectEllos")
    private String strIndicativeImperfectEllos = "";

    @Column(name = "fstrIndicativePreteriteYo")
    private String strIndicativePreteriteYo = "";

    @Column(name = "fstrIndicativePreteriteTu")
    private String strIndicativePreteriteTu = "";

    @Column(name = "fstrIndicativePreteriteUsted")
    private String strIndicativePreteriteUsted = "";

    @Column(name = "fstrIndicativePreteriteNosotros")
    private String strIndicativePreteriteNosotros = "";

    @Column(name = "fstrIndicativePreteriteVosotros")
    private String strIndicativePreteriteVosotros = "";

    @Column(name = "fstrIndicativePreteriteEllos")
    private String strIndicativePreteriteEllos = "";

    @Column(name = "fstrIndicativeFutureYo")
    private String strIndicativeFutureYo = "";

    @Column(name = "fstrIndicativeFutureTu")
    private String strIndicativeFutureTu = "";

    @Column(name = "fstrIndicativeFutureUsted")
    private String strIndicativeFutureUsted = "";

    @Column(name = "fstrIndicativeFutureNosotros")
    private String strIndicativeFutureNosotros = "";

    @Column(name = "fstrIndicativeFutureVosotros")
    private String fstrIndicativeFutureVosotros = "";

    @Column(name = "fstrIndicativeFutureEllos")
    private String strIndicativeFutureEllos = "";

    @Column(name = "fstrIndicativeConditionalYo")
    private String strIndicativeConditionalYo = "";

    @Column(name = "fstrIndicativeConditionalTu")
    private String strIndicativeConditionalTu = "";

    @Column(name = "fstrIndicativeConditionalUsted")
    private String strIndicativeConditionalUsted = "";

    @Column(name = "fstrIndicativeConditionalNosotros")
    private String strIndicativeConditionalNosotros = "";

    @Column(name = "fstrIndicativeConditionalVosotros")
    private String strIndicativeConditionalVosotros = "";

    @Column(name = "fstrIndicativeConditionalEllos")
    private String strIndicativeConditionalEllos = "";

    @Column(name = "fstrSubjunctivePresentYo")
    private String strSubjunctivePresentYo = "";

    @Column(name = "fstrSubjunctivePresentTu")
    private String strSubjunctivePresentTu = "";

    @Column(name = "fstrSubjunctivePresentUsted")
    private String strSubjunctivePresentUsted = "";

    @Column(name = "fstrSubjunctivePresentNosotros")
    private String strSubjunctivePresentNosotros = "";

    @Column(name = "fstrSubjunctivePresentVosotros")
    private String strSubjunctivePresentVosotros = "";

    @Column(name = "fstrSubjunctivePresentEllos")
    private String strSubjunctivePresentEllos = "";

    @Column(name = "fstrSubjunctiveImperfectRaYo")
    private String strSubjunctiveImperfectRaYo = "";

    @Column(name = "fstrSubjunctiveImperfectRaTu")
    private String strSubjunctiveImperfectRaTu = "";

    @Column(name = "fstrSubjunctiveImperfectRaUsted")
    private String strSubjunctiveImperfectRaUsted = "";

    @Column(name = "fstrSubjunctiveImperfectRaNosotros")
    private String strSubjunctiveImperfectRaNosotros = "";

    @Column(name = "fstrSubjunctiveImperfectRaVosotros")
    private String strSubjunctiveImperfectRaVosotros = "";

    @Column(name = "fstrSubjunctiveImperfectRaEllos")
    private String strSubjunctiveImperfectRaEllos = "";

    @Column(name = "fstrSubjunctiveImperfectSeYo")
    private String strSubjunctiveImperfectSeYo = "";

    @Column(name = "fstrSubjunctiveImperfectSeTu")
    private String strSubjunctiveImperfectSeTu = "";

    @Column(name = "fstrSubjunctiveImperfectSeUsted")
    private String strSubjunctiveImperfectSeUsted = "";

    @Column(name = "fstrSubjunctiveImperfectSeNosotros")
    private String strSubjunctiveImperfectSeNosotros = "";

    @Column(name = "fstrSubjunctiveImperfectSeVosotros")
    private String strSubjunctiveImperfectSeVosotros = "";

    @Column(name = "fstrSubjunctiveImperfectSeEllos")
    private String strSubjunctiveImperfectSeEllos = "";

    @Column(name = "fstrSubjunctiveFutureYo")
    private String strSubjunctiveFutureYo = "";

    @Column(name = "fstrSubjunctiveFutureTu")
    private String strSubjunctiveFutureTu = "";

    @Column(name = "fstrSubjunctiveFutureUsted")
    private String strSubjunctiveFutureUsted = "";

    @Column(name = "fstrSubjunctiveFutureNosotros")
    private String strSubjunctiveFutureNosotros = "";

    @Column(name = "fstrSubjunctiveFutureVosotros")
    private String strSubjunctiveFutureVosotros = "";

    @Column(name = "fstrSubjunctiveFutureEllos")
    private String strSubjunctiveFutureEllos = "";

    @Column(name = "fstrImperativeAffirmativeTu")
    private String strImperativeAffirmativeTu = "";

    @Column(name = "fstrImperativeAffirmativeUsted")
    private String strImperativeAffirmativeUsted = "";

    @Column(name = "fstrImperativeAffirmativeNosotros")
    private String strImperativeAffirmativeNosotros = "";

    @Column(name = "fstrImperativeAffirmativeVosotros")
    private String strImperativeAffirmativeVosotros = "";

    @Column(name = "fstrImperativeAffirmativeEllos")
    private String strImperativeAffirmativeEllos = "";

    @Column(name = "fstrImperativeNegativeTu")
    private String strImperativeNegativeTu = "";

    @Column(name = "fstrImperativeNegativeUsted")
    private String strImperativeNegativeUsted = "";

    @Column(name = "fstrImperativeNegativeNosotros")
    private String strImperativeNegativeNosotros = "";

    @Column(name = "fstrImperativeNegativeVosotros")
    private String strImperativeNegativeVosotros = "";

    @Column(name = "fstrImperativeNegativeEllos")
    private String strImperativeNegativeEllos = "";
    //endregion

    public SpanishVerbConjugation(String pstrInfinitive,
                                  String pstrGerund,
                                  String pstrPastParticipleMasculineSingular,
                                  String pstrPastParticipleFeminineSingular,
                                  String pstrPastParticipleMasculinePlural,
                                  String pstrPastParticipleFemininePlural,
                                  String pstrIndicativePresentYo,
                                  String pstrIndicativePresentTu,
                                  String pstrIndicativePresentUsted,
                                  String pstrIndicativePresentNosotros,
                                  String pstrIndicativePresentVosotros,
                                  String pstrIndicativePresentEllos,
                                  String pstrIndicativeImperfectYo,
                                  String pstrIndicativeImperfectTu,
                                  String pstrIndicativeImperfectUsted,
                                  String pstrIndicativeImperfectNosotros,
                                  String pstrIndicativeImperfectVosotros,
                                  String pstrIndicativeImperfectEllos,
                                  String pstrIndicativePreteriteYo,
                                  String pstrIndicativePreteriteTu,
                                  String pstrIndicativePreteriteUsted,
                                  String pstrIndicativePreteriteNosotros,
                                  String pstrIndicativePreteriteVosotros,
                                  String pstrIndicativePreteriteEllos,
                                  String pstrIndicativeFutureYo,
                                  String pstrIndicativeFutureTu,
                                  String pstrIndicativeFutureUsted,
                                  String pstrIndicativeFutureNosotros,
                                  String pfstrIndicativeFutureVosotros,
                                  String pstrIndicativeFutureEllos,
                                  String pstrIndicativeConditionalYo,
                                  String pstrIndicativeConditionalTu,
                                  String pstrIndicativeConditionalUsted,
                                  String pstrIndicativeConditionalNosotros,
                                  String pstrIndicativeConditionalVosotros,
                                  String pstrIndicativeConditionalEllos,
                                  String pstrSubjunctivePresentYo,
                                  String pstrSubjunctivePresentTu,
                                  String pstrSubjunctivePresentUsted,
                                  String pstrSubjunctivePresentNosotros,
                                  String pstrSubjunctivePresentVosotros,
                                  String pstrSubjunctivePresentEllos,
                                  String pstrSubjunctiveImperfectRaYo,
                                  String pstrSubjunctiveImperfectRaTu,
                                  String pstrSubjunctiveImperfectRaUsted,
                                  String pstrSubjunctiveImperfectRaNosotros,
                                  String pstrSubjunctiveImperfectRaVosotros,
                                  String pstrSubjunctiveImperfectRaEllos,
                                  String pstrSubjunctiveImperfectSeYo,
                                  String pstrSubjunctiveImperfectSeTu,
                                  String pstrSubjunctiveImperfectSeUsted,
                                  String pstrSubjunctiveImperfectSeNosotros,
                                  String pstrSubjunctiveImperfectSeVosotros,
                                  String pstrSubjunctiveImperfectSeEllos,
                                  String pstrSubjunctiveFutureYo,
                                  String pstrSubjunctiveFutureTu,
                                  String pstrSubjunctiveFutureUsted,
                                  String pstrSubjunctiveFutureNosotros,
                                  String pstrSubjunctiveFutureVosotros,
                                  String pstrSubjunctiveFutureEllos,
                                  String pstrImperativeAffirmativeTu,
                                  String pstrImperativeAffirmativeUsted,
                                  String pstrImperativeAffirmativeNosotros,
                                  String pstrImperativeAffirmativeVosotros,
                                  String pstrImperativeAffirmativeEllos,
                                  String pstrImperativeNegativeTu,
                                  String pstrImperativeNegativeUsted,
                                  String pstrImperativeNegativeNosotros,
                                  String pstrImperativeNegativeVosotros,
                                  String pstrImperativeNegativeEllos) {
        this.strInfinitive = pstrInfinitive;
        this.strGerund = pstrGerund;
        this.strPastParticipleMasculineSingular = pstrPastParticipleMasculineSingular;
        this.strPastParticipleFeminineSingular = pstrPastParticipleFeminineSingular;
        this.strPastParticipleMasculinePlural = pstrPastParticipleMasculinePlural;
        this.strPastParticipleFemininePlural = pstrPastParticipleFemininePlural;
        this.strIndicativePresentYo = pstrIndicativePresentYo;
        this.strIndicativePresentTu = pstrIndicativePresentTu;
        this.strIndicativePresentUsted = pstrIndicativePresentUsted;
        this.strIndicativePresentNosotros = pstrIndicativePresentNosotros;
        this.strIndicativePresentVosotros = pstrIndicativePresentVosotros;
        this.strIndicativePresentEllos = pstrIndicativePresentEllos;
        this.strIndicativeImperfectYo = pstrIndicativeImperfectYo;
        this.strIndicativeImperfectTu = pstrIndicativeImperfectTu;
        this.strIndicativeImperfectUsted = pstrIndicativeImperfectUsted;
        this.strIndicativeImperfectNosotros = pstrIndicativeImperfectNosotros;
        this.strIndicativeImperfectVosotros = pstrIndicativeImperfectVosotros;
        this.strIndicativeImperfectEllos = pstrIndicativeImperfectEllos;
        this.strIndicativePreteriteYo = pstrIndicativePreteriteYo;
        this.strIndicativePreteriteTu = pstrIndicativePreteriteTu;
        this.strIndicativePreteriteUsted = pstrIndicativePreteriteUsted;
        this.strIndicativePreteriteNosotros = pstrIndicativePreteriteNosotros;
        this.strIndicativePreteriteVosotros = pstrIndicativePreteriteVosotros;
        this.strIndicativePreteriteEllos = pstrIndicativePreteriteEllos;
        this.strIndicativeFutureYo = pstrIndicativeFutureYo;
        this.strIndicativeFutureTu = pstrIndicativeFutureTu;
        this.strIndicativeFutureUsted = pstrIndicativeFutureUsted;
        this.strIndicativeFutureNosotros = pstrIndicativeFutureNosotros;
        this.fstrIndicativeFutureVosotros = pfstrIndicativeFutureVosotros;
        this.strIndicativeFutureEllos = pstrIndicativeFutureEllos;
        this.strIndicativeConditionalYo = pstrIndicativeConditionalYo;
        this.strIndicativeConditionalTu = pstrIndicativeConditionalTu;
        this.strIndicativeConditionalUsted = pstrIndicativeConditionalUsted;
        this.strIndicativeConditionalNosotros = pstrIndicativeConditionalNosotros;
        this.strIndicativeConditionalVosotros = pstrIndicativeConditionalVosotros;
        this.strIndicativeConditionalEllos = pstrIndicativeConditionalEllos;
        this.strSubjunctivePresentYo = pstrSubjunctivePresentYo;
        this.strSubjunctivePresentTu = pstrSubjunctivePresentTu;
        this.strSubjunctivePresentUsted = pstrSubjunctivePresentUsted;
        this.strSubjunctivePresentNosotros = pstrSubjunctivePresentNosotros;
        this.strSubjunctivePresentVosotros = pstrSubjunctivePresentVosotros;
        this.strSubjunctivePresentEllos = pstrSubjunctivePresentEllos;
        this.strSubjunctiveImperfectRaYo = pstrSubjunctiveImperfectRaYo;
        this.strSubjunctiveImperfectRaTu = pstrSubjunctiveImperfectRaTu;
        this.strSubjunctiveImperfectRaUsted = pstrSubjunctiveImperfectRaUsted;
        this.strSubjunctiveImperfectRaNosotros = pstrSubjunctiveImperfectRaNosotros;
        this.strSubjunctiveImperfectRaVosotros = pstrSubjunctiveImperfectRaVosotros;
        this.strSubjunctiveImperfectRaEllos = pstrSubjunctiveImperfectRaEllos;
        this.strSubjunctiveImperfectSeYo = pstrSubjunctiveImperfectSeYo;
        this.strSubjunctiveImperfectSeTu = pstrSubjunctiveImperfectSeTu;
        this.strSubjunctiveImperfectSeUsted = pstrSubjunctiveImperfectSeUsted;
        this.strSubjunctiveImperfectSeNosotros = pstrSubjunctiveImperfectSeNosotros;
        this.strSubjunctiveImperfectSeVosotros = pstrSubjunctiveImperfectSeVosotros;
        this.strSubjunctiveImperfectSeEllos = pstrSubjunctiveImperfectSeEllos;
        this.strSubjunctiveFutureYo = pstrSubjunctiveFutureYo;
        this.strSubjunctiveFutureTu = pstrSubjunctiveFutureTu;
        this.strSubjunctiveFutureUsted = pstrSubjunctiveFutureUsted;
        this.strSubjunctiveFutureNosotros = pstrSubjunctiveFutureNosotros;
        this.strSubjunctiveFutureVosotros = pstrSubjunctiveFutureVosotros;
        this.strSubjunctiveFutureEllos = pstrSubjunctiveFutureEllos;
        this.strImperativeAffirmativeTu = pstrImperativeAffirmativeTu;
        this.strImperativeAffirmativeUsted = pstrImperativeAffirmativeUsted;
        this.strImperativeAffirmativeNosotros = pstrImperativeAffirmativeNosotros;
        this.strImperativeAffirmativeVosotros = pstrImperativeAffirmativeVosotros;
        this.strImperativeAffirmativeEllos = pstrImperativeAffirmativeEllos;
        this.strImperativeNegativeTu = pstrImperativeNegativeTu;
        this.strImperativeNegativeUsted = pstrImperativeNegativeUsted;
        this.strImperativeNegativeNosotros = pstrImperativeNegativeNosotros;
        this.strImperativeNegativeVosotros = pstrImperativeNegativeVosotros;
        this.strImperativeNegativeEllos = pstrImperativeNegativeEllos;
    }

     public SpanishVerbConjugation(List<String> pstrConjugationList) {
        if (pstrConjugationList.size() > 0) {
            this.strInfinitive = pstrConjugationList.get(0);
            this.strGerund = pstrConjugationList.get(1);
            this.strPastParticipleMasculineSingular = pstrConjugationList.get(2);
            this.strPastParticipleFeminineSingular = pstrConjugationList.get(3);
            this.strPastParticipleMasculinePlural = pstrConjugationList.get(4);
            this.strPastParticipleFemininePlural = pstrConjugationList.get(5);
            this.strIndicativePresentYo = pstrConjugationList.get(6);
            this.strIndicativePresentTu = pstrConjugationList.get(7);
            this.strIndicativePresentUsted = pstrConjugationList.get(8);
            this.strIndicativePresentNosotros = pstrConjugationList.get(9);
            this.strIndicativePresentVosotros = pstrConjugationList.get(10);
            this.strIndicativePresentEllos = pstrConjugationList.get(11);
            this.strIndicativeImperfectYo = pstrConjugationList.get(12);
            this.strIndicativeImperfectTu = pstrConjugationList.get(13);
            this.strIndicativeImperfectUsted = pstrConjugationList.get(14);
            this.strIndicativeImperfectNosotros = pstrConjugationList.get(15);
            this.strIndicativeImperfectVosotros = pstrConjugationList.get(16);
            this.strIndicativeImperfectEllos = pstrConjugationList.get(17);
            this.strIndicativePreteriteYo = pstrConjugationList.get(18);
            this.strIndicativePreteriteTu = pstrConjugationList.get(19);
            this.strIndicativePreteriteUsted = pstrConjugationList.get(20);
            this.strIndicativePreteriteNosotros = pstrConjugationList.get(21);
            this.strIndicativePreteriteVosotros = pstrConjugationList.get(22);
            this.strIndicativePreteriteEllos = pstrConjugationList.get(23);
            this.strIndicativeFutureYo = pstrConjugationList.get(24);
            this.strIndicativeFutureTu = pstrConjugationList.get(25);
            this.strIndicativeFutureUsted = pstrConjugationList.get(26);
            this.strIndicativeFutureNosotros = pstrConjugationList.get(27);
            this.fstrIndicativeFutureVosotros = pstrConjugationList.get(28);
            this.strIndicativeFutureEllos = pstrConjugationList.get(29);
            this.strIndicativeConditionalYo = pstrConjugationList.get(30);
            this.strIndicativeConditionalTu = pstrConjugationList.get(31);
            this.strIndicativeConditionalUsted = pstrConjugationList.get(32);
            this.strIndicativeConditionalNosotros = pstrConjugationList.get(33);
            this.strIndicativeConditionalVosotros = pstrConjugationList.get(34);
            this.strIndicativeConditionalEllos = pstrConjugationList.get(35);
            this.strSubjunctivePresentYo = pstrConjugationList.get(36);
            this.strSubjunctivePresentTu = pstrConjugationList.get(37);
            this.strSubjunctivePresentUsted = pstrConjugationList.get(38);
            this.strSubjunctivePresentNosotros = pstrConjugationList.get(39);
            this.strSubjunctivePresentVosotros = pstrConjugationList.get(40);
            this.strSubjunctivePresentEllos = pstrConjugationList.get(41);
            this.strSubjunctiveImperfectRaYo = pstrConjugationList.get(42);
            this.strSubjunctiveImperfectRaTu = pstrConjugationList.get(43);
            this.strSubjunctiveImperfectRaUsted = pstrConjugationList.get(44);
            this.strSubjunctiveImperfectRaNosotros = pstrConjugationList.get(45);
            this.strSubjunctiveImperfectRaVosotros = pstrConjugationList.get(46);
            this.strSubjunctiveImperfectRaEllos = pstrConjugationList.get(47);
            this.strSubjunctiveImperfectSeYo = pstrConjugationList.get(48);
            this.strSubjunctiveImperfectSeTu = pstrConjugationList.get(49);
            this.strSubjunctiveImperfectSeUsted = pstrConjugationList.get(50);
            this.strSubjunctiveImperfectSeNosotros = pstrConjugationList.get(51);
            this.strSubjunctiveImperfectSeVosotros = pstrConjugationList.get(52);
            this.strSubjunctiveImperfectSeEllos = pstrConjugationList.get(53);
            this.strSubjunctiveFutureYo = pstrConjugationList.get(54);
            this.strSubjunctiveFutureTu = pstrConjugationList.get(55);
            this.strSubjunctiveFutureUsted = pstrConjugationList.get(56);
            this.strSubjunctiveFutureNosotros = pstrConjugationList.get(57);
            this.strSubjunctiveFutureVosotros = pstrConjugationList.get(58);
            this.strSubjunctiveFutureEllos = pstrConjugationList.get(59);
            this.strImperativeAffirmativeTu = pstrConjugationList.get(60);
            this.strImperativeAffirmativeUsted = pstrConjugationList.get(61);
            this.strImperativeAffirmativeNosotros = pstrConjugationList.get(62);
            this.strImperativeAffirmativeVosotros = pstrConjugationList.get(63);
            this.strImperativeAffirmativeEllos = pstrConjugationList.get(64);
            this.strImperativeNegativeTu = pstrConjugationList.get(65);
            this.strImperativeNegativeUsted = pstrConjugationList.get(66);
            this.strImperativeNegativeNosotros = pstrConjugationList.get(67);
            this.strImperativeNegativeVosotros = pstrConjugationList.get(68);
            this.strImperativeNegativeEllos = pstrConjugationList.get(69);
        }
    }
    public void print() {
        if (strInfinitive.length() > 0) {
            System.out.println("Verb Conjugations:");
            System.out.println("    Infinitive:                          " + strInfinitive);
            System.out.println("    Gerund:                              " + strGerund);
            System.out.println("    Past Participle MasculineSingular:   " + strPastParticipleMasculineSingular);
            System.out.println("    Past Participle FeminineSingular:    " + strPastParticipleFeminineSingular);
            System.out.println("    Past Participle MasculinePlural:     " + strPastParticipleMasculinePlural);
            System.out.println("    Past Participle FemininePlural:      " + strPastParticipleFemininePlural);
            System.out.println("    Indicative Present Yo:               " + strIndicativePresentYo);
            System.out.println("    Indicative Present Tu:               " + strIndicativePresentTu);
            System.out.println("    Indicative Present Usted:            " + strIndicativePresentUsted);
            System.out.println("    Indicative Present Nosotros:         " + strIndicativePresentNosotros);
            System.out.println("    Indicative Present Vosotros:         " + strIndicativePresentVosotros);
            System.out.println("    Indicative Present Ellos:            " + strIndicativePresentEllos);
            System.out.println("    Indicative Imperfect Yo:             " + strIndicativeImperfectYo);
            System.out.println("    Indicative Imperfect Tu,:            " + strIndicativeImperfectTu);
            System.out.println("    Indicative Imperfect Usted,:         " + strIndicativeImperfectUsted);
            System.out.println("    Indicative Imperfect Nosotros,:      " + strIndicativeImperfectNosotros);
            System.out.println("    Indicative Imperfect Vosotros,:      " + strIndicativeImperfectVosotros);
            System.out.println("    Indicative Imperfect Ellos:          " + strIndicativeImperfectEllos);
            System.out.println("    Indicative Preterite Yo:             " + strIndicativePreteriteYo);
            System.out.println("    Indicative Preterite Tu:             " + strIndicativePreteriteTu);
            System.out.println("    Indicative Preterite Usted:          " + strIndicativePreteriteUsted);
            System.out.println("    Indicative Preterite Nosotros:       " + strIndicativePreteriteNosotros);
            System.out.println("    Indicative Preterite Vosotros:       " + strIndicativePreteriteVosotros);
            System.out.println("    Indicative Preterite Ellos:          " + strIndicativePreteriteEllos);
            System.out.println("    Indicative Future Yo:                " + strIndicativeFutureYo);
            System.out.println("    Indicative Future Tu:                " + strIndicativeFutureTu);
            System.out.println("    Indicative Future Usted:             " + strIndicativeFutureUsted);
            System.out.println("    Indicative Future Nosotros:          " + strIndicativeFutureNosotros);
            System.out.println("    Indicative Future Vosotros:          " + fstrIndicativeFutureVosotros);
            System.out.println("    Indicative Future Ellos:             " + strIndicativeFutureEllos);
            System.out.println("    Indicative Conditional Yo:           " + strIndicativeConditionalYo);
            System.out.println("    Indicative Conditional Tu:           " + strIndicativeConditionalTu);
            System.out.println("    Indicative Conditional Usted:        " + strIndicativeConditionalUsted);
            System.out.println("    Indicative Conditional Nosotros:     " + strIndicativeConditionalNosotros);
            System.out.println("    Indicative Conditional Vosotros:     " + strIndicativeConditionalVosotros);
            System.out.println("    Indicative Conditional Ellos:        " + strIndicativeConditionalEllos);
            System.out.println("    Subjunctive Present Yo:              " + strSubjunctivePresentYo);
            System.out.println("    Subjunctive Present Tu:              " + strSubjunctivePresentTu);
            System.out.println("    Subjunctive Present Usted:           " + strSubjunctivePresentUsted);
            System.out.println("    Subjunctive Present Nosotros:        " + strSubjunctivePresentNosotros);
            System.out.println("    Subjunctive Present Vosotros:        " + strSubjunctivePresentVosotros);
            System.out.println("    Subjunctive Present Ellos:           " + strSubjunctivePresentEllos);
            System.out.println("    Subjunctive Imperfect Ra Yo:         " + strSubjunctiveImperfectRaYo);
            System.out.println("    Subjunctive Imperfect Ra Tu:         " + strSubjunctiveImperfectRaTu);
            System.out.println("    Subjunctive Imperfect Ra Usted:      " + strSubjunctiveImperfectRaUsted);
            System.out.println("    Subjunctive Imperfect Ra Nosotros:   " + strSubjunctiveImperfectRaNosotros);
            System.out.println("    Subjunctive Imperfect Ra Vosotros:   " + strSubjunctiveImperfectRaVosotros);
            System.out.println("    Subjunctive Imperfect Ra Ellos:      " + strSubjunctiveImperfectRaEllos);
            System.out.println("    Subjunctive Imperfect Se Yo:         " + strSubjunctiveImperfectSeYo);
            System.out.println("    Subjunctive Imperfect Se Tu:         " + strSubjunctiveImperfectSeTu);
            System.out.println("    Subjunctive Imperfect Se Usted:      " + strSubjunctiveImperfectSeUsted);
            System.out.println("    Subjunctive Imperfect Se Nosotros:   " + strSubjunctiveImperfectSeNosotros);
            System.out.println("    Subjunctive Imperfect Se Vosotros:   " + strSubjunctiveImperfectSeVosotros);
            System.out.println("    Subjunctive Imperfect Se Ellos:      " + strSubjunctiveImperfectSeEllos);
            System.out.println("    Subjunctive Future Yo:               " + strSubjunctiveFutureYo);
            System.out.println("    Subjunctive Future Tu:               " + strSubjunctiveFutureTu);
            System.out.println("    Subjunctive Future Usted:            " + strSubjunctiveFutureUsted);
            System.out.println("    Subjunctive Future Nosotros:         " + strSubjunctiveFutureNosotros);
            System.out.println("    Subjunctive Future Vosotros:         " + strSubjunctiveFutureVosotros);
            System.out.println("    Subjunctive Future Ellos:            " + strSubjunctiveFutureEllos);
            System.out.println("    Imperative Affirmative Tu:           " + strImperativeAffirmativeTu);
            System.out.println("    Imperative Affirmative Usted:        " + strImperativeAffirmativeUsted);
            System.out.println("    Imperative Affirmative Nosotros:     " + strImperativeAffirmativeNosotros);
            System.out.println("    Imperative Affirmative Vosotros:     " + strImperativeAffirmativeVosotros);
            System.out.println("    Imperative Affirmative Ellos:        " + strImperativeAffirmativeEllos);
            System.out.println("    Imperative Negative Tu:              No " + strImperativeNegativeTu);
            System.out.println("    Imperative Negative Usted:           No " + strImperativeNegativeUsted);
            System.out.println("    Imperative Negative Nosotros:        No " + strImperativeNegativeNosotros);
            System.out.println("    Imperative Negative Vosotros:        No " + strImperativeNegativeVosotros);
            System.out.println("    Imperative Negative Ellos:           No " + strImperativeNegativeEllos);
        }
    }

    public String parsedData() {
        return (strInfinitive.length() == 0) ? Global.NOTHING_PARSED :
                strInfinitive + "," +
                strGerund + "," +
                strPastParticipleMasculineSingular + "," +
                strPastParticipleFeminineSingular + "," +
                strPastParticipleMasculinePlural + "," +
                strPastParticipleFemininePlural + "," +
                strIndicativePresentYo + "," +
                strIndicativePresentTu + "," +
                strIndicativePresentUsted + "," +
                strIndicativePresentNosotros + "," +
                strIndicativePresentVosotros + "," +
                strIndicativePresentEllos + "," +
                strIndicativeImperfectYo + "," +
                strIndicativeImperfectTu + "," +
                strIndicativeImperfectUsted + "," +
                strIndicativeImperfectNosotros + "," +
                strIndicativeImperfectVosotros + "," +
                strIndicativeImperfectEllos + "," +
                strIndicativePreteriteYo + "," +
                strIndicativePreteriteTu + "," +
                strIndicativePreteriteUsted + "," +
                strIndicativePreteriteNosotros + "," +
                strIndicativePreteriteVosotros + "," +
                strIndicativePreteriteEllos + "," +
                strIndicativeFutureYo + "," +
                strIndicativeFutureTu + "," +
                strIndicativeFutureUsted + "," +
                strIndicativeFutureNosotros + "," +
                fstrIndicativeFutureVosotros + "," +
                strIndicativeFutureEllos + "," +
                strIndicativeConditionalYo + "," +
                strIndicativeConditionalTu + "," +
                strIndicativeConditionalUsted + "," +
                strIndicativeConditionalNosotros + "," +
                strIndicativeConditionalVosotros + "," +
                strIndicativeConditionalEllos + "," +
                strSubjunctivePresentYo + "," +
                strSubjunctivePresentTu + "," +
                strSubjunctivePresentUsted + "," +
                strSubjunctivePresentNosotros + "," +
                strSubjunctivePresentVosotros + "," +
                strSubjunctivePresentEllos + "," +
                strSubjunctiveImperfectRaYo + "," +
                strSubjunctiveImperfectRaTu + "," +
                strSubjunctiveImperfectRaUsted + "," +
                strSubjunctiveImperfectRaNosotros + "," +
                strSubjunctiveImperfectRaVosotros + "," +
                strSubjunctiveImperfectRaEllos + "," +
                strSubjunctiveImperfectSeYo + "," +
                strSubjunctiveImperfectSeTu + "," +
                strSubjunctiveImperfectSeUsted + "," +
                strSubjunctiveImperfectSeNosotros + "," +
                strSubjunctiveImperfectSeVosotros + "," +
                strSubjunctiveImperfectSeEllos + "," +
                strSubjunctiveFutureYo + "," +
                strSubjunctiveFutureTu + "," +
                strSubjunctiveFutureUsted + "," +
                strSubjunctiveFutureNosotros + "," +
                strSubjunctiveFutureVosotros + "," +
                strSubjunctiveFutureEllos + "," +
                strImperativeAffirmativeTu + "," +
                strImperativeAffirmativeUsted + "," +
                strImperativeAffirmativeNosotros + "," +
                strImperativeAffirmativeVosotros + "," +
                strImperativeAffirmativeEllos + "," +
                strImperativeNegativeTu + "," +
                strImperativeNegativeUsted + "," +
                strImperativeNegativeNosotros + "," +
                strImperativeNegativeVosotros + "," +
                strImperativeNegativeEllos;
    }

}
