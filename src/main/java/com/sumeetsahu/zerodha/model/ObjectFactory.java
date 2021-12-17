
package com.sumeetsahu.zerodha.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sumeetsahu.zerodha.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContractNoteContractsContractIssuerLocationsLocationWebsite_QNAME = new QName("", "website");
    private final static QName _ContractNoteContractsContractIssuerLocationsLocationAddress_QNAME = new QName("", "address");
    private final static QName _ContractNoteContractsContractIssuerLocationsLocationContactPerson_QNAME = new QName("", "contact_person");
    private final static QName _ContractNoteContractsContractIssuerLocationsLocationPhone_QNAME = new QName("", "phone");
    private final static QName _ContractNoteContractsContractIssuerLocationsLocationName_QNAME = new QName("", "name");
    private final static QName _ContractNoteContractsContractIssuerLocationsLocationDescription_QNAME = new QName("", "description");
    private final static QName _ContractNoteContractsContractIssuerLocationsLocationEmail_QNAME = new QName("", "email");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sumeetsahu.zerodha.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContractNote }
     * 
     */
    public ContractNote createContractNote() {
        return new ContractNote();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts }
     * 
     */
    public ContractNote.Contracts createContractNoteContracts() {
        return new ContractNote.Contracts();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract }
     * 
     */
    public ContractNote.Contracts.Contract createContractNoteContractsContract() {
        return new ContractNote.Contracts.Contract();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Totals }
     * 
     */
    public ContractNote.Contracts.Contract.Totals createContractNoteContractsContractTotals() {
        return new ContractNote.Contracts.Contract.Totals();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Totals.Grandtotals }
     * 
     */
    public ContractNote.Contracts.Contract.Totals.Grandtotals createContractNoteContractsContractTotalsGrandtotals() {
        return new ContractNote.Contracts.Contract.Totals.Grandtotals();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Totals.Subtotals }
     * 
     */
    public ContractNote.Contracts.Contract.Totals.Subtotals createContractNoteContractsContractTotalsSubtotals() {
        return new ContractNote.Contracts.Contract.Totals.Subtotals();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Totals.Subtotals.Charges }
     * 
     */
    public ContractNote.Contracts.Contract.Totals.Subtotals.Charges createContractNoteContractsContractTotalsSubtotalsCharges() {
        return new ContractNote.Contracts.Contract.Totals.Subtotals.Charges();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Trades }
     * 
     */
    public ContractNote.Contracts.Contract.Trades createContractNoteContractsContractTrades() {
        return new ContractNote.Contracts.Contract.Trades();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Trades.Trade }
     * 
     */
    public ContractNote.Contracts.Contract.Trades.Trade createContractNoteContractsContractTradesTrade() {
        return new ContractNote.Contracts.Contract.Trades.Trade();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Trades.Trade.Charges }
     * 
     */
    public ContractNote.Contracts.Contract.Trades.Trade.Charges createContractNoteContractsContractTradesTradeCharges() {
        return new ContractNote.Contracts.Contract.Trades.Trade.Charges();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Instruments }
     * 
     */
    public ContractNote.Contracts.Contract.Instruments createContractNoteContractsContractInstruments() {
        return new ContractNote.Contracts.Contract.Instruments();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Exchanges }
     * 
     */
    public ContractNote.Contracts.Contract.Exchanges createContractNoteContractsContractExchanges() {
        return new ContractNote.Contracts.Contract.Exchanges();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Exchanges.Exchange }
     * 
     */
    public ContractNote.Contracts.Contract.Exchanges.Exchange createContractNoteContractsContractExchangesExchange() {
        return new ContractNote.Contracts.Contract.Exchanges.Exchange();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Exchanges.Exchange.Segments }
     * 
     */
    public ContractNote.Contracts.Contract.Exchanges.Exchange.Segments createContractNoteContractsContractExchangesExchangeSegments() {
        return new ContractNote.Contracts.Contract.Exchanges.Exchange.Segments();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment }
     * 
     */
    public ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment createContractNoteContractsContractExchangesExchangeSegmentsSegment() {
        return new ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements }
     * 
     */
    public ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements createContractNoteContractsContractExchangesExchangeSegmentsSegmentSettlements() {
        return new ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Client }
     * 
     */
    public ContractNote.Contracts.Contract.Client createContractNoteContractsContractClient() {
        return new ContractNote.Contracts.Contract.Client();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Client.Identities }
     * 
     */
    public ContractNote.Contracts.Contract.Client.Identities createContractNoteContractsContractClientIdentities() {
        return new ContractNote.Contracts.Contract.Client.Identities();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Issuer }
     * 
     */
    public ContractNote.Contracts.Contract.Issuer createContractNoteContractsContractIssuer() {
        return new ContractNote.Contracts.Contract.Issuer();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Issuer.Identities }
     * 
     */
    public ContractNote.Contracts.Contract.Issuer.Identities createContractNoteContractsContractIssuerIdentities() {
        return new ContractNote.Contracts.Contract.Issuer.Identities();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Issuer.Locations }
     * 
     */
    public ContractNote.Contracts.Contract.Issuer.Locations createContractNoteContractsContractIssuerLocations() {
        return new ContractNote.Contracts.Contract.Issuer.Locations();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Issuer.Locations.Location }
     * 
     */
    public ContractNote.Contracts.Contract.Issuer.Locations.Location createContractNoteContractsContractIssuerLocationsLocation() {
        return new ContractNote.Contracts.Contract.Issuer.Locations.Location();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Totals.Grandtotals.Grandtotal }
     * 
     */
    public ContractNote.Contracts.Contract.Totals.Grandtotals.Grandtotal createContractNoteContractsContractTotalsGrandtotalsGrandtotal() {
        return new ContractNote.Contracts.Contract.Totals.Grandtotals.Grandtotal();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge }
     * 
     */
    public ContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge createContractNoteContractsContractTotalsSubtotalsChargesCharge() {
        return new ContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Trades.Trade.Charges.Charge }
     * 
     */
    public ContractNote.Contracts.Contract.Trades.Trade.Charges.Charge createContractNoteContractsContractTradesTradeChargesCharge() {
        return new ContractNote.Contracts.Contract.Trades.Trade.Charges.Charge();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Instruments.Instrument }
     * 
     */
    public ContractNote.Contracts.Contract.Instruments.Instrument createContractNoteContractsContractInstrumentsInstrument() {
        return new ContractNote.Contracts.Contract.Instruments.Instrument();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements.Settlement }
     * 
     */
    public ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements.Settlement createContractNoteContractsContractExchangesExchangeSegmentsSegmentSettlementsSettlement() {
        return new ContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements.Settlement();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Client.Identities.Identity }
     * 
     */
    public ContractNote.Contracts.Contract.Client.Identities.Identity createContractNoteContractsContractClientIdentitiesIdentity() {
        return new ContractNote.Contracts.Contract.Client.Identities.Identity();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Issuer.Identities.Identity }
     * 
     */
    public ContractNote.Contracts.Contract.Issuer.Identities.Identity createContractNoteContractsContractIssuerIdentitiesIdentity() {
        return new ContractNote.Contracts.Contract.Issuer.Identities.Identity();
    }

    /**
     * Create an instance of {@link ContractNote.Contracts.Contract.Issuer.Locations.Location.Address }
     * 
     */
    public ContractNote.Contracts.Contract.Issuer.Locations.Location.Address createContractNoteContractsContractIssuerLocationsLocationAddress() {
        return new ContractNote.Contracts.Contract.Issuer.Locations.Location.Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "website", scope = ContractNote.Contracts.Contract.Issuer.Locations.Location.class)
    public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationWebsite(String value) {
        return new JAXBElement<String>(_ContractNoteContractsContractIssuerLocationsLocationWebsite_QNAME, String.class, ContractNote.Contracts.Contract.Issuer.Locations.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractNote.Contracts.Contract.Issuer.Locations.Location.Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = ContractNote.Contracts.Contract.Issuer.Locations.Location.class)
    public JAXBElement<ContractNote.Contracts.Contract.Issuer.Locations.Location.Address> createContractNoteContractsContractIssuerLocationsLocationAddress(ContractNote.Contracts.Contract.Issuer.Locations.Location.Address value) {
        return new JAXBElement<ContractNote.Contracts.Contract.Issuer.Locations.Location.Address>(_ContractNoteContractsContractIssuerLocationsLocationAddress_QNAME, ContractNote.Contracts.Contract.Issuer.Locations.Location.Address.class, ContractNote.Contracts.Contract.Issuer.Locations.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contact_person", scope = ContractNote.Contracts.Contract.Issuer.Locations.Location.class)
    public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationContactPerson(String value) {
        return new JAXBElement<String>(_ContractNoteContractsContractIssuerLocationsLocationContactPerson_QNAME, String.class, ContractNote.Contracts.Contract.Issuer.Locations.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phone", scope = ContractNote.Contracts.Contract.Issuer.Locations.Location.class)
    public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationPhone(String value) {
        return new JAXBElement<String>(_ContractNoteContractsContractIssuerLocationsLocationPhone_QNAME, String.class, ContractNote.Contracts.Contract.Issuer.Locations.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ContractNote.Contracts.Contract.Issuer.Locations.Location.class)
    public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationName(String value) {
        return new JAXBElement<String>(_ContractNoteContractsContractIssuerLocationsLocationName_QNAME, String.class, ContractNote.Contracts.Contract.Issuer.Locations.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = ContractNote.Contracts.Contract.Issuer.Locations.Location.class)
    public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationDescription(String value) {
        return new JAXBElement<String>(_ContractNoteContractsContractIssuerLocationsLocationDescription_QNAME, String.class, ContractNote.Contracts.Contract.Issuer.Locations.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = ContractNote.Contracts.Contract.Issuer.Locations.Location.class)
    public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationEmail(String value) {
        return new JAXBElement<String>(_ContractNoteContractsContractIssuerLocationsLocationEmail_QNAME, String.class, ContractNote.Contracts.Contract.Issuer.Locations.Location.class, value);
    }

}
