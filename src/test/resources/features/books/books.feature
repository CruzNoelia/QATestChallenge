Feature: Available books on NYC
  Users need to know about available books on the NYT platform

  Scenario: Get BestSelling Books
    Given Noelia wants to know about the BestSelling Books
    When She looks the BestSelling History
    Then She must see the BestSelling History

  Scenario: Dont Get BestSelling Books
    Given Noelia wants to know about the BestSelling Books
    When She looks the BestSelling History without proper credentials
    Then She wont see the BestSelling History

  Scenario: Get HardCover Titles
    Given Noelia wants to know about the HardCover Books
    When She looks the HardCover Collection
    Then She must see the HardCover History

  Scenario: Get Stephen King reviews
    Given Noelia wants to know about the Stephen King Reviews
    When She looks the Stephen King Reviews Collection
    Then She must see the Stephen King reviews Collection