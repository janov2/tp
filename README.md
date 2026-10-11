

```mermaid
classDiagram
    class Main {
        +main(args) void
    }
    class Message {
        -String sender
        -String content
        +getSender() String
        +getContent() String
    }
    class MessagingService {
        -List~Message~ messages
        +add(message: Message) void
        +getMessages() List~Message~
    }

    Main --> MessagingService : uses
    MessagingService "1" o-- "0..*" Message : stores