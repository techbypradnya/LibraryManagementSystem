package library.main;

import library.model.Book;
import library.model.Member;
import library.service.BookService;
import library.service.MemberService;
import library.service.IssueService;
import library.util.InputUtil;

public class LibraryApp {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        IssueService issueService = new IssueService();

        int choice;

        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Add Member");
            System.out.println("5. Issue Book");
            System.out.println("6. View Issued Books");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = InputUtil.sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Book ID: ");
                        int bid = InputUtil.sc.nextInt();
                        InputUtil.sc.nextLine();
                        System.out.print("Title: ");
                        String title = InputUtil.sc.nextLine();
                        System.out.print("Author: ");
                        String author = InputUtil.sc.nextLine();
                        System.out.print("Quantity: ");
                        int qty = InputUtil.sc.nextInt();
                        bookService.addBook(new Book(bid, title, author, qty));
                        break;

                    case 2:
                        bookService.viewBooks();
                        break;
                        
                    case 3:   // ✅ DELETE BOOK
                        System.out.print("Enter Book ID to delete: ");
                        int delId = InputUtil.sc.nextInt();
                        bookService.deleteBook(delId);
                        System.out.println("Book deleted successfully!");
                        break;

                    case 4:
                        System.out.print("Member ID: ");
                        int mid = InputUtil.sc.nextInt();
                        InputUtil.sc.nextLine();
                        System.out.print("Name: ");
                        String name = InputUtil.sc.nextLine();
                        memberService.addMember(new Member(mid, name));
                        break;

                    case 5:
                        System.out.print("Book ID: ");
                        int bookId = InputUtil.sc.nextInt();
                        System.out.print("Member ID: ");
                        int memberId = InputUtil.sc.nextInt();
                        issueService.issueBook(bookService.findBook(bookId), memberId);
                        System.out.println("Book issued successfully!");
                        break;

                    case 6:
                        issueService.viewIssuedBooks();
                        break;

                    case 7:
                        System.out.println("Exiting system...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 7);
    }
}
