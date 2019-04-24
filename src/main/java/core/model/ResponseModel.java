package core.model;

import java.io.Serializable;
import java.util.List;

public class ResponseModel implements Serializable{
    /**
     * area : 323802.0
     * nativeName : Norge
     * capital : Oslo
     * demonym : Norwegian
     * flag : https://restcountries.eu/data/nor.svg
     * alpha2Code : NO
     * languages : [{"nativeName":"Norsk","iso639_2":"nor","name":"Norwegian","iso639_1":"no"},{"nativeName":"Norsk bokmål","iso639_2":"nob","name":"Norwegian Bokmål","iso639_1":"nb"},{"nativeName":"Norsk nynorsk","iso639_2":"nno","name":"Norwegian Nynorsk","iso639_1":"nn"}]
     * borders : ["FIN","SWE","RUS"]
     * subregion : Northern Europe
     * callingCodes : ["47"]
     * regionalBlocs : [{"otherNames":[],"acronym":"EFTA","name":"European Free Trade Association","otherAcronyms":[]}]
     * gini : 25.8
     * population : 5223256
     * numericCode : 578
     * alpha3Code : NOR
     * topLevelDomain : [".no"]
     * timezones : ["UTC+01:00"]
     * cioc : NOR
     * translations : {"br":"Noruega","de":"Norwegen","pt":"Noruega","ja":"ノルウェー","hr":"Norveška","it":"Norvegia","fa":"نروژ","fr":"Norvège","es":"Noruega","nl":"Noorwegen"}
     * name : Norway
     * altSpellings : ["NO","Norge","Noreg","Kingdom of Norway","Kongeriket Norge","Kongeriket Noreg"]
     * region : Europe
     * latlng : [62,10]
     * currencies : [{"symbol":"kr","code":"NOK","name":"Norwegian krone"}]
     */
    private double area;
    private String nativeName;
    private String capital;
    private String demonym;
    private String flag;
    private String alpha2Code;
    private List<LanguagesEntity> languages;
    private List<String> borders;
    private String subregion;
    private List<String> callingCodes;
    private List<RegionalBlocsEntity> regionalBlocs;
    private double gini;
    private int population;
    private String numericCode;
    private String alpha3Code;
    private List<String> topLevelDomain;
    private List<String> timezones;
    private String cioc;
    private TranslationsEntity translations;
    private String name;
    private List<String> altSpellings;
    private String region;
    private List<Double> latlng;
    private List<CurrenciesEntity> currencies;


    public void setArea(double area) {
        this.area = area;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public void setLanguages(List<LanguagesEntity> languages) {
        this.languages = languages;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public void setRegionalBlocs(List<RegionalBlocsEntity> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public void setTranslations(TranslationsEntity translations) {
        this.translations = translations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public void setCurrencies(List<CurrenciesEntity> currencies) {
        this.currencies = currencies;
    }

    public double getArea() {
        return area;
    }

    public String getNativeName() {
        return nativeName;
    }

    public String getCapital() {
        return capital;
    }

    public String getDemonym() {
        return demonym;
    }

    public String getFlag() {
        return flag;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public List<LanguagesEntity> getLanguages() {
        return languages;
    }

    public List<String> getBorders() {
        return borders;
    }

    public String getSubregion() {
        return subregion;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public List<RegionalBlocsEntity> getRegionalBlocs() {
        return regionalBlocs;
    }

    public double getGini() {
        return gini;
    }

    public int getPopulation() {
        return population;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public String getCioc() {
        return cioc;
    }

    public TranslationsEntity getTranslations() {
        return translations;
    }

    public String getName() {
        return name;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public List<CurrenciesEntity> getCurrencies() {
        return currencies;
    }

    public class LanguagesEntity {
        /**
         * nativeName : Norsk
         * iso639_2 : nor
         * name : Norwegian
         * iso639_1 : no
         */
        private String nativeName;
        private String iso639_2;
        private String name;
        private String iso639_1;

        public void setNativeName(String nativeName) {
            this.nativeName = nativeName;
        }

        public void setIso639_2(String iso639_2) {
            this.iso639_2 = iso639_2;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIso639_1(String iso639_1) {
            this.iso639_1 = iso639_1;
        }

        public String getNativeName() {
            return nativeName;
        }

        public String getIso639_2() {
            return iso639_2;
        }

        public String getName() {
            return name;
        }

        public String getIso639_1() {
            return iso639_1;
        }
    }

    public class RegionalBlocsEntity {
        /**
         * otherNames : []
         * acronym : EFTA
         * name : European Free Trade Association
         * otherAcronyms : []
         */
        private List<?> otherNames;
        private String acronym;
        private String name;
        private List<?> otherAcronyms;

        public void setOtherNames(List<?> otherNames) {
            this.otherNames = otherNames;
        }

        public void setAcronym(String acronym) {
            this.acronym = acronym;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOtherAcronyms(List<?> otherAcronyms) {
            this.otherAcronyms = otherAcronyms;
        }

        public List<?> getOtherNames() {
            return otherNames;
        }

        public String getAcronym() {
            return acronym;
        }

        public String getName() {
            return name;
        }

        public List<?> getOtherAcronyms() {
            return otherAcronyms;
        }
    }

    public class TranslationsEntity {
        /**
         * br : Noruega
         * de : Norwegen
         * pt : Noruega
         * ja : ノルウェー
         * hr : Norveška
         * it : Norvegia
         * fa : نروژ
         * fr : Norvège
         * es : Noruega
         * nl : Noorwegen
         */
        private String br;
        private String de;
        private String pt;
        private String ja;
        private String hr;
        private String it;
        private String fa;
        private String fr;
        private String es;
        private String nl;

        public void setBr(String br) {
            this.br = br;
        }

        public void setDe(String de) {
            this.de = de;
        }

        public void setPt(String pt) {
            this.pt = pt;
        }

        public void setJa(String ja) {
            this.ja = ja;
        }

        public void setHr(String hr) {
            this.hr = hr;
        }

        public void setIt(String it) {
            this.it = it;
        }

        public void setFa(String fa) {
            this.fa = fa;
        }

        public void setFr(String fr) {
            this.fr = fr;
        }

        public void setEs(String es) {
            this.es = es;
        }

        public void setNl(String nl) {
            this.nl = nl;
        }

        public String getBr() {
            return br;
        }

        public String getDe() {
            return de;
        }

        public String getPt() {
            return pt;
        }

        public String getJa() {
            return ja;
        }

        public String getHr() {
            return hr;
        }

        public String getIt() {
            return it;
        }

        public String getFa() {
            return fa;
        }

        public String getFr() {
            return fr;
        }

        public String getEs() {
            return es;
        }

        public String getNl() {
            return nl;
        }
    }

    public class CurrenciesEntity {
        /**
         * symbol : kr
         * code : NOK
         * name : Norwegian krone
         */
        private String symbol;
        private String code;
        private String name;

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }
   /* private String _name;
    private String _capital;
    private String _flag;
    private String _numericCode;
    private String _currencies;
    public ResponseModel (String name, String capital, String flag, String numericCode, String currencies){
        _name = name;
        _capital = capital;
        _flag = flag;
        _numericCode = numericCode;
        _currencies = currencies;

    }

    public String get_capital() {
        return _capital;
    } */



}

