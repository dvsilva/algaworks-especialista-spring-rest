# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 07-07-evoluindo-banco-de-dados-com-novas-migracoes
git add .
git commit -m "Evoluindo o banco de dados com novas migrações"
git push origin 07-07-evoluindo-banco-de-dados-com-novas-migracoes

git checkout master
git merge --no-ff 07-07-evoluindo-banco-de-dados-com-novas-migracoes
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