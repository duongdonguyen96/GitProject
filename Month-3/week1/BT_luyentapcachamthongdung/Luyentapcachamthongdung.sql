SELECT * FROM cac_ham_thong_dung.cachamthongdung;

-- Viết câu lệnh hiện thị tất cả các dòng có tên là Huong
SELECT * FROM cac_ham_thong_dung.cachamthongdung
WHERE ten ="Huong";

-- Viết câu lệnh lấy ra tổng số tiền của Huong
SELECT ten,sum(sotien) as tongsotien FROM cac_ham_thong_dung.cachamthongdung
WHERE ten ="Huong";

-- Viết câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp
SELECT DISTINCT ten,tuoi,khoahoc,sotien FROM cac_ham_thong_dung.cachamthongdung;

