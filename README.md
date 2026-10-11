```mermaid
classDiagram
    class Main {
        +main(args)
    }
    class Message {
        -String sender
        -String content
        +getSender()
        +getContent()
    }
    class MessagingService {
        -List list
        +add(message)
        +getMessages()
    }

    Main --> MessagingService : uses
    MessagingService o-- Message : stores