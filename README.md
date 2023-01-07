# OOP

Git

Giới thiệu:

+ Git là phần mềm quản lý mã nguồn phân tán được phát triển bởi Linus Torvalds vào năm 2005, ban đầu dành cho việc phát triển nhân Linux. Hiện nay, Git trở thành một trong các phần mềm quản lý mã nguồn phổ biến nhất.

Git là một hệ thống quản lý phiên bản phân tán được phát triển bởi Linus Torvalds (Distributed Version Control System – DVCS), nó là một trong những hệ thống quản lý phiên bản phân tán phổ biến nhất hiện nay. Git cung cấp cho mỗi lập trình viên kho lưu trữ (repository) riêng chứa toàn bộ lịch sử thay đổi.
Git có nhiều trang hỗ trợ như: github.com, bitbucket.com, ... không phải git là chỉ riêng trang github, git giống như là 1 chuẩn quản lý phiên bản
Các thuật ngữ của Git:

Branch :

Các Branch (nhánh) đại diện cho các phiên bản cụ thể của một kho lưu trữ tách ra từ project chính của bạn.
Branch cho phép bạn theo dõi các thay đổi thử nghiệm bạn thực hiện đối với kho lưu trữ và có thể hoàn nguyên về các phiên bản cũ hơn.
Commit

Một commit đại diện cho một điểm cụ thể trong lịch sử dự án của bạn.
Sử dụng lệnh commit kết hợp với lệnh git add để cho git biết những thay đổi bạn muốn lưu vào kho lưu trữ cục bộ (local repository). Lưu ý rằng các xác nhận không được tự động gửi đến máy chủ từ xa.
Checkout:

Sử dụng lệnh git checkout để chuyển giữa các branch.
Chỉ cần nhập git checkout theo sau là tên của branch bạn muốn chuyển đến hoặc nhập git checkout master để trở về branch chính (master branch).
Hãy nhớ những commit của bạn khi bạn chuyển đổi giữa các branch.
Fetch:

Lệnh git fetch tìm nạp các bản sao và tải xuống tất cả các tệp branch vào máy tính của bạn.
Sử dụng nó để lưu các thay đổi mới nhất vào kho lưu trữ của bạn. Nó có thể tìm nạp nhiều branch cùng một lúc.
Fork:

Một fork là một bản sao của một kho lưu trữ. Các lập trình viên thường tận dụng lợi ích của fork để thử nghiệm các thay đổi mà không ảnh hưởng đến dự án chính.
Head:

Các commit ở đầu của một branch được gọi là head. Nó đại diện cho commit mới nhất của kho lưu trữ mà bạn hiện đang làm việc.
Index:

Bất cứ khi nào bạn thêm, xóa hoặc thay đổi một tệp, nó vẫn nằm trong chỉ mục cho đến khi bạn sẵn sàng commit các thay đổi.

Hãy nghĩ về nó như khu vực tổ chức (stagging area) cho Git. Sử dụng lệnh git status để xem nội dung của index của bạn.

Stagging (bước dàn dựng) là một bước sắp xếp trước khi commit trong git.

Một commit trong git được thực hiện theo hai bước: Stagging và commit thực tế. Miễn là những thay đổi nằm trong khu vực tổ chức (stagging area), git cho phép bạn chỉnh sửa nó theo ý muốn (thay thế các tệp được phân đoạn bằng các phiên bản khác của các tệp được phân loại, loại bỏ các thay đổi khỏi phân đoạn, v.v.)

Những thay đổi được tô sáng bằng màu xanh lá cây đã sẵn sàng để được commit trong khi những thay đổi màu đỏ thì chưa.

Master:

Master là nhánh chính của tất cả các kho lưu trữ của bạn. Nó nên bao gồm nhữngthay đổi và commit gần đây nhất.
Merge:

Sử dụng lệnh git merge kết hợp với các yêu cầu kéo (pull requests) để thêm các thay đổi từ nhánh này sang nhánh khác.
Origin:

Origin đề cập đến phiên bản mặc định của kho lưu trữ. Origin cũng đóng vai trò là bí danh hệ thống để liên lạc với nhánh chính.
Sử dụng lệnh git push origin master để đẩy các thay đổi cục bộ đến nhánh chính.
Pull:

Pull requests thể hiện các đề xuất thay đổi cho nhánh chính. Nếu bạn làm việc với một nhóm, bạn có thể tạo các pull request để yêu cầu người bảo trì kho lưu trữ xem xét các thay đổi và hợp nhất chúng.
Lệnh git pull được sử dụng để thêm các thay đổi vào nhánh chính.
Push:

Lệnh git push được sử dụng để cập nhật các nhánh từ xa với những thay đổi mới nhất mà bạn đã commit.
Rebase:

Lệnh git rebase cho phép bạn phân tách, di chuyển hoặc thoát khỏi các commit. Nó cũng có thể được sử dụng để kết hợp hai nhánh khác nhau.
Remote

Một Remote (kho lưu trữ từ xa) là một bản sao của một chi nhánh. Remote giao tiếp ngược dòng với nhánh gốc (origin branch) của chúng và các Remote khác trong kho lưu trữ.
Repository

Kho lưu trữ Git chứa tất cả các tệp dự án của bạn bao gồm các branch, tags và commit.
Stash

Lệnh git stash sẽ loại bỏ các thay đổi khỏi chỉ mục của bạn và xóa stashes chúng đi sau.
Nó có ích nếu bạn muốn tạm dừng những gì bạn đang làm và làm việc khác trong một khoảng thời gian. Bạn không thể đặt stash nhiều hơn một bộ thay đổi ở cùng một thời điểm.
Tags

Tags cung cấp cho bạn một cách để theo dõi các commit quan trọng. Các tags nhẹ chỉ đơn giản đóng vai trò là con trỏ trong khi các tags chú thích được lưu trữ dưới dạng các đối tượng đầy đủ.
Upstream

Trong ngữ cảnh của Git, upstream đề cập đến nơi bạn push các thay đổi của mình, thường là nhánh chính (master branch).
Lợi ích của Git

Các dự án thực tế thường có nhiều lập trình viên làm việc song song. Vì vậy, một hệ thống kiểm soát phiên bản như Git là cần thiết để đảm bảo không có xung đột code giữa các lập trình viên.
Ngoài ra, các yêu cầu trong các dự án như vậy thay đổi thường xuyên. Vì vậy, một hệ thống kiểm soát phiên bản cho phép các nhà phát triển revert và quay lại phiên bản cũ hơn của code.
Cuối cùng, đôi khi một số dự án đang được chạy song song liên quan đến cùng một cơ sở code. Trong trường hợp như vậy, khái niệm phân nhánh trong Git là rất quan trọng.
Dễ sử dụng, thao tác nhanh, gọn, lẹ và rất an toàn.
Sễ dàng kết hợp các phân nhánh (branch), có thể giúp quy trình làm việc code theo nhóm đơn giản hơn rất nhiều.
Chỉ cần clone mã nguồn từ kho chứa hoặc clone một phiên bản thay đổi nào đó từ kho chứa, hoặc một nhánh nào đó từ kho chứa là bạn có thể làm việc ở mọi lúc mọi nơi.
Deployment sản phẩm của bạn một cách không thể nào dễ dàng hơn.
Cách làm việc nhóm với Git

Đầu tiên trưởng nhóm sẽ tạo project trên Git và tạo repository.
Up các lên repository
Thêm các thành viên trong nhóm vào Git
Các thành viên sẽ clone về local của mình ( git clone urf project)
Các thành viên sẽ tạo các branch riêng không trùng vs branch master để code nhiệm vụ của mình mà không làm code cảu dự án chung bị bug
Khi các thành viên code xong và muốn up code cảu mình lên :
Đầu tiên sẽ dùng lệnh: git commit -m "thông báo" để ghi chú giải thích về những gì mình làm
Tiếp đến sẽ dùng lệnh: git pull origin "branch" ( branch của riêng mình) để so sánh các thay đổi được thực hiện trong tệp và nếu có bất kỳ xung đột nào với branch master thì có thể fix để không gây lỗi dự án
Cuối cùng, nếu code không có vấn đề gì thì sẽ merge nhánh riêng với nhánh chính để thêm vào dự án chung. Merge chỉ diễn ra khi không xảy ra xung đột conflict. Github sẽ kiểm tra conflict, nếu xảy ra xung đột bạn phải giải quyết vấn đề này trước khi lệnh merge được thực hiện.
Lưu ý nên sau khi merge thành công nên xoá branch đấy đi và tạo branch mới để thực hiện nhiệm vụ tiếp theo.
Các lưu ý để sử dụng Git hiệu quả :

Commit thường xuyên
Tách nhỏ commit của bạn và commit thường xuyên nhất có thể. Điều này giúp các thành viên trong nhóm dễ dàng tích hợp công việc của họ hơn mà không gặp phải xung đột hợp nhất.
Test rồi mới commit
Không bao giờ commit nếu chưa hoàn tất quy trình. Cần phải test các thay đổi của bạn trước khi chia sẻ chúng với người khác.
Viết ghi chú khi commit
Viết ghi chú khi commit để cho các thành viên khác trong nhóm biết loại thay đổi bạn đã thực hiện. Hãy mô tả càng nhiều càng tốt.
Thử nghiệm Branch khác
Tận dụng lợi thế của các branch để giúp bạn theo dõi các dòng phát triển khác nhau.
Git Workflow
Gitflow Workflow là một thiết kế quy trình làm việc được sử dụng lần đầu tiên và làm cho phổ biến bởi Vincent Driessen at nvie. Gitflow Workflow định nghĩa một cấu trúc phân nhánh nghiêm ngặt xung quanh bản release của dự án. Điều này cung cấp thêm một framework mạnh mẽ để quản lý các dự án lớn.Gitflow Workflow phù hợp với những mô hình phát triển phần mềm có thời gian release có chu kỳ như scrum. Workflow này không có thêm concepts hoặc commands mới nào ngoài những tính năng cho Feature Branch Workflow. Thay vào đó chúng chỉ định vai trò cụ thể của các branches khác nhau và thời điểm mà chúng cần tương tác. Ngoài ra còn có các branches đặc biệt cho việc preparing, maintaining và release. Tất nhiên, bạn có thể tận dụng các lợi thế của Feature Branch Workflow để tăng tính hiệu quả.
Sử dụng Git Cheet Sheets
Sử dụng Git cheet sheets để có thể dễ dàng tìm ra được những lệnh mà mình cần sử dụng
