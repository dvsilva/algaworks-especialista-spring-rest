# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 03-07-importando-dados-teste-com-import-sql
git add .
git commit -m "Importando dados de teste com import.sql"
git push origin 03-07-importando-dados-teste-com-import-sql

git checkout master
git merge --no-ff 03-07-importando-dados-teste-com-import-sql
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```