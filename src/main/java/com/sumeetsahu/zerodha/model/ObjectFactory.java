package com.sumeetsahu.zerodha.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the com.sumeetsahu.zerodha.model package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _ContractNoteContractsContractIssuerLocationsLocationWebsite_QNAME =
      new QName("", "website");
  private static final QName _ContractNoteContractsContractIssuerLocationsLocationAddress_QNAME =
      new QName("", "address");
  private static final QName
      _ContractNoteContractsContractIssuerLocationsLocationContactPerson_QNAME =
          new QName("", "contact_person");
  private static final QName _ContractNoteContractsContractIssuerLocationsLocationPhone_QNAME =
      new QName("", "phone");
  private static final QName _ContractNoteContractsContractIssuerLocationsLocationName_QNAME =
      new QName("", "name");
  private static final QName
      _ContractNoteContractsContractIssuerLocationsLocationDescription_QNAME =
          new QName("", "description");
  private static final QName _ContractNoteContractsContractIssuerLocationsLocationEmail_QNAME =
      new QName("", "email");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: com.sumeetsahu.zerodha.model
   */
  public ObjectFactory() {}

  /** Create an instance of {@link ZerodhaContractNote } */
  public ZerodhaContractNote createContractNote() {
    return new ZerodhaContractNote();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts } */
  public ZerodhaContractNote.Contracts createContractNoteContracts() {
    return new ZerodhaContractNote.Contracts();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract } */
  public ZerodhaContractNote.Contracts.Contract createContractNoteContractsContract() {
    return new ZerodhaContractNote.Contracts.Contract();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Totals } */
  public ZerodhaContractNote.Contracts.Contract.Totals createContractNoteContractsContractTotals() {
    return new ZerodhaContractNote.Contracts.Contract.Totals();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Totals.Grandtotals } */
  public ZerodhaContractNote.Contracts.Contract.Totals.Grandtotals
      createContractNoteContractsContractTotalsGrandtotals() {
    return new ZerodhaContractNote.Contracts.Contract.Totals.Grandtotals();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Totals.Subtotals } */
  public ZerodhaContractNote.Contracts.Contract.Totals.Subtotals
      createContractNoteContractsContractTotalsSubtotals() {
    return new ZerodhaContractNote.Contracts.Contract.Totals.Subtotals();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges } */
  public ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges
      createContractNoteContractsContractTotalsSubtotalsCharges() {
    return new ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Trades } */
  public ZerodhaContractNote.Contracts.Contract.Trades createContractNoteContractsContractTrades() {
    return new ZerodhaContractNote.Contracts.Contract.Trades();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Trades.Trade } */
  public ZerodhaContractNote.Contracts.Contract.Trades.Trade
      createContractNoteContractsContractTradesTrade() {
    return new ZerodhaContractNote.Contracts.Contract.Trades.Trade();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Trades.Trade.Charges } */
  public ZerodhaContractNote.Contracts.Contract.Trades.Trade.Charges
      createContractNoteContractsContractTradesTradeCharges() {
    return new ZerodhaContractNote.Contracts.Contract.Trades.Trade.Charges();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Instruments } */
  public ZerodhaContractNote.Contracts.Contract.Instruments
      createContractNoteContractsContractInstruments() {
    return new ZerodhaContractNote.Contracts.Contract.Instruments();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Exchanges } */
  public ZerodhaContractNote.Contracts.Contract.Exchanges createContractNoteContractsContractExchanges() {
    return new ZerodhaContractNote.Contracts.Contract.Exchanges();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange } */
  public ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange
      createContractNoteContractsContractExchangesExchange() {
    return new ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments } */
  public ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments
      createContractNoteContractsContractExchangesExchangeSegments() {
    return new ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments();
  }

  /**
   * Create an instance of {@link
   * ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment }
   */
  public ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment
      createContractNoteContractsContractExchangesExchangeSegmentsSegment() {
    return new ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment();
  }

  /**
   * Create an instance of {@link
   * ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements }
   */
  public ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements
      createContractNoteContractsContractExchangesExchangeSegmentsSegmentSettlements() {
    return new ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Client } */
  public ZerodhaContractNote.Contracts.Contract.Client createContractNoteContractsContractClient() {
    return new ZerodhaContractNote.Contracts.Contract.Client();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Client.Identities } */
  public ZerodhaContractNote.Contracts.Contract.Client.Identities
      createContractNoteContractsContractClientIdentities() {
    return new ZerodhaContractNote.Contracts.Contract.Client.Identities();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Issuer } */
  public ZerodhaContractNote.Contracts.Contract.Issuer createContractNoteContractsContractIssuer() {
    return new ZerodhaContractNote.Contracts.Contract.Issuer();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Issuer.Identities } */
  public ZerodhaContractNote.Contracts.Contract.Issuer.Identities
      createContractNoteContractsContractIssuerIdentities() {
    return new ZerodhaContractNote.Contracts.Contract.Issuer.Identities();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Issuer.Locations } */
  public ZerodhaContractNote.Contracts.Contract.Issuer.Locations
      createContractNoteContractsContractIssuerLocations() {
    return new ZerodhaContractNote.Contracts.Contract.Issuer.Locations();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location } */
  public ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location
      createContractNoteContractsContractIssuerLocationsLocation() {
    return new ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location();
  }

  /**
   * Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Totals.Grandtotals.Grandtotal }
   */
  public ZerodhaContractNote.Contracts.Contract.Totals.Grandtotals.Grandtotal
      createContractNoteContractsContractTotalsGrandtotalsGrandtotal() {
    return new ZerodhaContractNote.Contracts.Contract.Totals.Grandtotals.Grandtotal();
  }

  /**
   * Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge }
   */
  public ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge
      createContractNoteContractsContractTotalsSubtotalsChargesCharge() {
    return new ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Trades.Trade.Charges.Charge } */
  public ZerodhaContractNote.Contracts.Contract.Trades.Trade.Charges.Charge
      createContractNoteContractsContractTradesTradeChargesCharge() {
    return new ZerodhaContractNote.Contracts.Contract.Trades.Trade.Charges.Charge();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Instruments.Instrument } */
  public ZerodhaContractNote.Contracts.Contract.Instruments.Instrument
      createContractNoteContractsContractInstrumentsInstrument() {
    return new ZerodhaContractNote.Contracts.Contract.Instruments.Instrument();
  }

  /**
   * Create an instance of {@link
   * ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements.Settlement }
   */
  public ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements.Settlement
      createContractNoteContractsContractExchangesExchangeSegmentsSegmentSettlementsSettlement() {
    return new ZerodhaContractNote.Contracts.Contract.Exchanges.Exchange.Segments.Segment.Settlements
        .Settlement();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Client.Identities.Identity } */
  public ZerodhaContractNote.Contracts.Contract.Client.Identities.Identity
      createContractNoteContractsContractClientIdentitiesIdentity() {
    return new ZerodhaContractNote.Contracts.Contract.Client.Identities.Identity();
  }

  /** Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Issuer.Identities.Identity } */
  public ZerodhaContractNote.Contracts.Contract.Issuer.Identities.Identity
      createContractNoteContractsContractIssuerIdentitiesIdentity() {
    return new ZerodhaContractNote.Contracts.Contract.Issuer.Identities.Identity();
  }

  /**
   * Create an instance of {@link ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address
   * }
   */
  public ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address
      createContractNoteContractsContractIssuerLocationsLocationAddress() {
    return new ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address();
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "website",
      scope = ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class)
  public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationWebsite(
      String value) {
    return new JAXBElement<String>(
        _ContractNoteContractsContractIssuerLocationsLocationWebsite_QNAME,
        String.class,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link
   * ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address }{@code >}}
   */
  @XmlElementDecl(
      namespace = "",
      name = "address",
      scope = ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class)
  public JAXBElement<ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address>
      createContractNoteContractsContractIssuerLocationsLocationAddress(
          ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address value) {
    return new JAXBElement<ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address>(
        _ContractNoteContractsContractIssuerLocationsLocationAddress_QNAME,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.Address.class,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "contact_person",
      scope = ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class)
  public JAXBElement<String>
      createContractNoteContractsContractIssuerLocationsLocationContactPerson(String value) {
    return new JAXBElement<String>(
        _ContractNoteContractsContractIssuerLocationsLocationContactPerson_QNAME,
        String.class,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "phone",
      scope = ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class)
  public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationPhone(
      String value) {
    return new JAXBElement<String>(
        _ContractNoteContractsContractIssuerLocationsLocationPhone_QNAME,
        String.class,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "name",
      scope = ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class)
  public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationName(
      String value) {
    return new JAXBElement<String>(
        _ContractNoteContractsContractIssuerLocationsLocationName_QNAME,
        String.class,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "description",
      scope = ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class)
  public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationDescription(
      String value) {
    return new JAXBElement<String>(
        _ContractNoteContractsContractIssuerLocationsLocationDescription_QNAME,
        String.class,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "email",
      scope = ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class)
  public JAXBElement<String> createContractNoteContractsContractIssuerLocationsLocationEmail(
      String value) {
    return new JAXBElement<String>(
        _ContractNoteContractsContractIssuerLocationsLocationEmail_QNAME,
        String.class,
        ZerodhaContractNote.Contracts.Contract.Issuer.Locations.Location.class,
        value);
  }
}
